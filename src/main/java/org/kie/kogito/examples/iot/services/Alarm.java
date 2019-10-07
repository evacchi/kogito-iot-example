package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Alarm {
    public boolean enabled = false;
    public void enable() {
        this.enabled = true;
    }
    public void disable() {
        this.enabled = false;
    }
}