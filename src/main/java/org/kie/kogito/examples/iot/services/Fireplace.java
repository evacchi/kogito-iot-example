package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Fireplace {
    private boolean onFire;
    public void startFire() {
        this.onFire = true;
    }
    public void stopFire() {
        this.onFire = false;
    }
}