package org.acme;


import org.acme.ws.HelloWorld;

import javax.inject.Inject;

public class GreetingService implements HelloWorld {

    @Inject
    Greeter greeter;

    @Override
    public String sayHelloWorld(String parameters) {
        return greeter.greet(parameters);
    }
}
