package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Weather {
    public boolean enabled = false;
    public Object readForecast(Object o) {
        this.enabled = true;
        return null;
    }
    public Object stop(Object o) {
        this.enabled = false;
        return null;
    }
}