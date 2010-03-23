package com.braintreegateway.example;

import org.ztemplates.actions.ZMatch;
import org.ztemplates.web.ZTemplates;

@ZMatch("/customers/new")
public class NewCustomerAction {
    public void after() throws Exception {
        ZTemplates.getServletService().render(new NewCustomer(Configuration.getBraintreeGateway()));
    }
}