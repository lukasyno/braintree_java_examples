package com.braintreegateway.example;

import org.ztemplates.render.ZExpose;
import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

import com.braintreegateway.Transaction;

@ZRenderer(ZVelocityRenderer.class)
public class ConfirmPayment {
    private Transaction transaction;
    
    public ConfirmPayment(Transaction transaction) {
        this.transaction = transaction;
    }
    
    @ZExpose
    public String getAmount() {
        return transaction.getAmount().toString();
    }
    
    @ZExpose
    public String getId() {
        return transaction.getId();
    }
    
    @ZExpose
    public String getFirstName() {
        return transaction.getCustomer().getFirstName();
    }
    
    @ZExpose
    public String getLastName() {
        return transaction.getCustomer().getLastName();
    }
    
    @ZExpose
    public String getEmail() {
        return transaction.getCustomer().getEmail();
    }
    
    @ZExpose
    public String getNumber() {
        return transaction.getCreditCard().getMaskedNumber();
    }
    
    @ZExpose
    public String getCardType() {
        return transaction.getCreditCard().getCardType();
    }
}
