package com.braintreegateway.example;

import org.ztemplates.render.ZExpose;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.CustomerRequest;

public class BaseCustomer {
    protected BraintreeGateway gateway;
    protected String amount;
    
    @ZExpose
    public String getTrUrl() {
        return gateway.customer().transparentRedirectURLForCreate();
    }
    
    @ZExpose
    public String getTrData() {
        CustomerRequest trRequest = new CustomerRequest();
        
        return gateway.trData(trRequest, "http://localhost:8080/trvault/customers/confirm");
    }
    
    @ZExpose
    public String getCompany() {
        return "";
    }
    
    @ZExpose
    public String getCreditCardNumber() {
        return "";
    }
    
    @ZExpose
    public String getCreditCardExpirationDate() {
        return "";
    }
    
    @ZExpose
    public String getEmail() {
        return "";
    }
    
    @ZExpose
    public String getFax() {
        return "";
    }
    
    @ZExpose
    public String getFirstName() {
        return "";
    }
    
    @ZExpose
    public String getLastName() {
        return "";
    }
    
    @ZExpose
    public String getPhone() {
        return "";
    }
    
    @ZExpose
    public String getWebsite() {
        return "";
    }
}
