package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Light {
    private double value = 1.0;
    public Object dim(double value) {
        this.value = value;
        return null;
    }
}