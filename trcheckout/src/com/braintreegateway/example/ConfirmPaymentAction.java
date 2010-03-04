package com.braintreegateway.example;

import org.ztemplates.actions.ZMatch;
import org.ztemplates.web.ZTemplates;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;
import com.braintreegateway.Result;
import com.braintreegateway.Transaction;

@ZMatch("/payments/confirm")
public class ConfirmPaymentAction {
    public void after() throws Exception {
        BraintreeGateway gateway = new BraintreeGateway(
            Environment.DEVELOPMENT,
            "integration_merchant_id",
            "integration_public_key",
            "integration_private_key"
        );
        
        String queryString = ZTemplates.getServletService().getRequest().getQueryString();
        Result<Transaction> result = gateway.transaction().confirmTransparentRedirect(queryString);
        
        if (result.isSuccess()) {
            ZTemplates.getServletService().render(new ConfirmPayment(result.getTarget()));
        } else {
            ZTemplates.getServletService().render(new ErrorPayment(gateway, result.getParameters(), result.getErrors()));
        }
    }
}
