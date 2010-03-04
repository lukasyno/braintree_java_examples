package com.braintreegateway.example;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

public class Configuration {

    public static BraintreeGateway getBraintreeGateway() {
        return new BraintreeGateway(
                Environment.DEVELOPMENT, 
                "integration_merchant_id",
                "integration_public_key",
                "integration_private_key"
            );
    }
}
