package com.braintreegateway.example;

import org.ztemplates.render.ZExpose;
import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

import com.braintreegateway.Customer;

@ZRenderer(ZVelocityRenderer.class)
public class ConfirmCustomer {
    private Customer customer;
    
    public ConfirmCustomer(Customer customer) {
        this.customer = customer;
    }
    
    @ZExpose
    public String getCompany() {
    	return emptyStringIfNull(customer.getCompany());
    }
    
    @ZExpose
    public String getCreditCardNumber() {
    	return emptyStringIfNull(customer.getCreditCards().get(0).getMaskedNumber());
    }
    
    @ZExpose
    public String getCreditCardExpirationDate() {
        return emptyStringIfNull(customer.getCreditCards().get(0).getExpirationDate());
    }
    
    @ZExpose
    public String getEmail() {
    	return emptyStringIfNull(customer.getEmail());
    }
    
    @ZExpose
    public String getFax() {
    	return emptyStringIfNull(customer.getFax());
    }
    
    @ZExpose
    public String getFirstName() {
    	return emptyStringIfNull(customer.getFirstName());
    }
    
    @ZExpose
    public String getLastName() {
    	return emptyStringIfNull(customer.getLastName());
    }
    
    @ZExpose
    public String getPhone() {
    	return emptyStringIfNull(customer.getPhone());
    }
    
    @ZExpose
    public String getWebsite() {
    	return emptyStringIfNull(customer.getWebsite());
    }
    
    private String emptyStringIfNull(String string) {
    	if (string == null) {
    		return "";
    	}
    	return string;
    }
}
