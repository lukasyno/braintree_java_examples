package com.braintreegateway.example;

import org.ztemplates.render.ZRenderer;
import org.ztemplates.render.velocity.ZVelocityRenderer;

import com.braintreegateway.BraintreeGateway;

@ZRenderer(ZVelocityRenderer.class)
public class NewCustomer extends BaseCustomer {
    public NewCustomer(BraintreeGateway gateway) {
        this.gateway = gateway;
    }
}