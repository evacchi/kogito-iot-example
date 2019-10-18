package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Alarm {
    public boolean enabled = false;
    public Object enable(Object o) {
        System.out.println("!! ALARM INTRUDER !! WHEOWHEOWHEOWHEO");
        this.enabled = true;
        return null;
    }
    public Object disable(Object o) {
        this.enabled = false;
        return null;
    }
}