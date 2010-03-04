package com.braintreegateway.example;

import java.math.BigDecimal;

import org.ztemplates.render.ZExpose;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Transaction;
import com.braintreegateway.TransactionRequest;

public class Payment {
    protected BraintreeGateway gateway;
    protected String amount;
    
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
