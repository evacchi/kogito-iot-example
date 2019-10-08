package org.kie.kogito.examples.iot.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Video {
    public boolean enabled = false;
    public Object start(Object o) {
        this.enabled = true;
        return null;
    }
    public Object stop(Object o) {
        this.enabled = false;
        return null;
    }
}