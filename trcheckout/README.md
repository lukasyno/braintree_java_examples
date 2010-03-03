# trcheckout

## Overview

This code is a demonstration of creating one time transactions using the
Braintree transparent redirect API.  We decided to use the
[ZTemplates](http://www.ztemplates.org) framework because the lack of
boilerplate code and configuration allows us to clearly demonstrate concepts
without added noise.

## Getting Started

To run the exmaple:

* Install [Apache Tomcat version 6.x](http://tomcat.apache.org/download-60.cgi)
* Update com.braintreegateway.example.Configuration.java with your sandbox credentials
* Run "ant" in this directory
* Symlink (or copy) the trcheckout directory into tomcat/webapps
* Start tomcat
* Visit [http://localhost:8080/trcheckout/payments/new](http://localhost:8080/trcheckout/payments/new)
