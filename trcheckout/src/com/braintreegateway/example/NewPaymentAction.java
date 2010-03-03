package com.braintreegateway.example;

import org.ztemplates.actions.ZMatch;
import org.ztemplates.web.ZTemplates;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

@ZMatch("/payments/new")
public class NewPaymentAction {
    public void after() throws Exception {
        BraintreeGateway gateway = new BraintreeGateway(
            Environment.DEVELOPMENT, 
            "integration_merchant_id", 
            "integration_public_key",
            "integration_private_key"
        );

        ZTemplates.getServletService().render(new NewPayment(gateway));
    }
}