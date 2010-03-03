package com.braintreegateway.example;

import java.math.BigDecimal;

import org.ztemplates.render.ZExpose;
import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Transaction;
import com.braintreegateway.TransactionRequest;

@ZRenderer(ZVelocityRenderer.class)
public class NewPayment {
    private BraintreeGateway gateway;
    private String amount;
    
    public NewPayment(BraintreeGateway gateway) {
        this.gateway = gateway;
        this.amount = "100.00";
    }
    
    @ZExpose
    public String getTrUrl() {
        return gateway.transaction().transparentRedirectURLForCreate();
    }
    
    @ZExpose
    public String getTrData() {
        TransactionRequest trRequest = new TransactionRequest().
            type(Transaction.Type.SALE).
            amount(new BigDecimal(getAmount()));
        
        return gateway.trData(trRequest, "http://localhost:8080/trcheckout/payments/confirm");
    }

    @ZExpose
    public String getAmount() {
        return amount;
    }
}