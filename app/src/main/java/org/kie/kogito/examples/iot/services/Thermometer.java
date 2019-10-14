package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Thermometer {
    public Object readTemperature(Object o) {
        return 24.0;
    }
}