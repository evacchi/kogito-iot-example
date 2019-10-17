package org.kie.kogito.examples.iot.data;

public class DoorSensor {
    private final boolean frontDoor;
    private final boolean kitchenWindow;
    private final boolean bedRoomWindow;
    private final boolean bathRoomWindow;
    private final boolean livingRoomWindow;


    public DoorSensor(boolean frontDoor, boolean kitchenWindow, boolean bedRoomWindow, boolean bathRoomWindow, boolean livingRoomWindow) {
        this.frontDoor = frontDoor;
        this.kitchenWindow = kitchenWindow;
        this.bedRoomWindow = bedRoomWindow;
        this.bathRoomWindow = bathRoomWindow;
        this.livingRoomWindow = livingRoomWindow;
    }


    public boolean getFrontDoor() {
        return this.frontDoor;
    }

    public boolean isFrontDoor() {
        return this.frontDoor;
    }

    public boolean getKitchenWindow() {
        return this.kitchenWindow;
    }

    public boolean isKitchenWindow() {
        return this.kitchenWindow;
    }

    public boolean getBedRoomWindow() {
        return this.bedRoomWindow;
    }

    public boolean isBedRoomWindow() {
        return this.bedRoomWindow;
    }

    public boolean getBathRoomWindow() {
        return this.bathRoomWindow;
    }

    public boolean isBathRoomWindow() {
        return this.bathRoomWindow;
    }

    public boolean getLivingRoomWindow() {
        return this.livingRoomWindow;
    }

    public boolean isLivingRoomWindow() {
        return this.livingRoomWindow;
    }

}