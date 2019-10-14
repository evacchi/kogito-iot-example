package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Fireplace {
    private boolean onFire;
    public Object startFire(Object o) {
        this.onFire = true;
        return null;
    }
    public Object stopFire(Object o) {
        this.onFire = false;
        return null;
    }
}