package org.acme;

import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Greeter {

    @Counted(name = "greeter-count", absolute = true)
    public String greet(String who) {
        return "Hello " + who;
    }
}
