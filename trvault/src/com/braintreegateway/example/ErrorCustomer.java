package com.braintreegateway.example;

import java.util.List;
import java.util.Map;

import org.ztemplates.render.ZExpose;
import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.ValidationError;
import com.braintreegateway.ValidationErrors;

@ZRenderer(ZVelocityRenderer.class)
public class ErrorCustomer extends BaseCustomer {
    private ValidationErrors errors;
    private Map<String, String> params;
    
    public ErrorCustomer(BraintreeGateway gateway, Map<String, String> params, ValidationErrors errors) {
        this.gateway = gateway;
        this.params = params;
        this.errors = errors;
    }
    
    @ZExpose
    public String getCompany() {
    	return paramOrEmpty("customer[company]");
    }
    
    @ZExpose
    public String getCreditCardExpirationDate() {
    	return paramOrEmpty("customer[credit_card][expiration_date]");
    }
    
    @ZExpose
    public String getEmail() {
    	return paramOrEmpty("customer[email]");
    }
    
    @ZExpose
    public String getFax() {
        return paramOrEmpty("customer[fax]");
    }
    
    @ZExpose
    public String getFirstName() {
    	return paramOrEmpty("customer[first_name]");
    }
    
    @ZExpose
    public String getLastName() {
        return paramOrEmpty("customer[last_name]");
    }
    
    @ZExpose
    public String getPhone() {
    	return paramOrEmpty("customer[phone]");
    }
    
    @ZExpose
    public String getWebsite() {
    	return paramOrEmpty("customer[website]");
    }
    
    @ZExpose
    public boolean getAnyCompanyErrors() {
        return errors.forObject("customer").onField("company").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getCompanyErrors() {
        return errors.forObject("customer").onField("company");
    }
    
    @ZExpose
    public boolean getAnyCreditCardNumberErrors() {
        return errors.forObject("customer").forObject("credit_card").onField("number").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getCreditCardNumberErrors() {
        return errors.forObject("customer").forObject("credit_card").onField("number");
    }
    
    @ZExpose
    public boolean getAnyCreditCardExpirationDateErrors() {
        return errors.forObject("customer").forObject("credit_card").onField("expiration_date").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getCreditCardExpirationDateErrors() {
        return errors.forObject("customer").forObject("credit_card").onField("expiration_date");
    }
    
    @ZExpose
    public boolean getAnyEmailErrors() {
        return errors.forObject("customer").onField("email").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getEmailErrors() {
        return errors.forObject("customer").onField("email");
    }
    
    @ZExpose
    public boolean getAnyFaxErrors() {
        return errors.forObject("customer").onField("fax").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getFaxErrors() {
        return errors.forObject("customer").onField("fax");
    }
    
    @ZExpose
    public boolean getAnyFirstNameErrors() {
        return errors.forObject("customer").onField("first_name").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getFirstNameErrors() {
        return errors.forObject("customer").onField("first_name");
    }
    
    @ZExpose
    public boolean getAnyLastNameErrors() {
        return errors.forObject("customer").onField("last_name").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getLastNameErrors() {
        return errors.forObject("customer").onField("last_name");
    }
    
    @ZExpose
    public boolean getAnyPhoneErrors() {
        return errors.forObject("customer").onField("phone").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getPhoneErrors() {
        return errors.forObject("customer").onField("phone");
    }
    
    @ZExpose
    public boolean getAnyWebsiteErrors() {
        return errors.forObject("customer").onField("website").size() > 0;
    }
    
    @ZExpose
    public List<ValidationError> getWebsiteErrors() {
        return errors.forObject("customer").onField("website");
    }
    
    @ZExpose
    public int getNumErrors() {
        return errors.deepSize();
    }
    
    private String paramOrEmpty(String name) {
        String param = params.get(name);
        if (param == null) {
            return "";
        } else {
            return param;
        }
    }
}
