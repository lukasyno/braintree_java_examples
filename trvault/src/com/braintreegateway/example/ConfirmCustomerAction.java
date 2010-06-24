package com.braintreegateway.example;

import org.ztemplates.actions.ZMatch;
import org.ztemplates.web.ZTemplates;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Customer;
import com.braintreegateway.Result;

@ZMatch("/customers/confirm")
public class ConfirmCustomerAction {
    public void after() throws Exception {
        BraintreeGateway gateway = Configuration.getBraintreeGateway();

        String queryString = ZTemplates.getServletService().getRequest().getQueryString();
        Result<Customer> result = gateway.transparentRedirect().confirmCustomer(queryString);

        if (result.isSuccess()) {
            ZTemplates.getServletService().render(new ConfirmCustomer(result.getTarget()));
        } else {
            ZTemplates.getServletService().render(new ErrorCustomer(gateway, result.getParameters(), result.getErrors()));
        }
    }
}
