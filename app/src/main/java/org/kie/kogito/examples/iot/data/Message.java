package org.kie.kogito.examples.iot.data;

import java.util.Objects;

public class Message {
    private String command;

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return this.command;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Message)) {
            return false;
        }
        Message message = (Message) o;
        return Objects.equals(command, message.command);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(command);
    }

    @Override
    public String toString() {
        return "{" +
            " command='" + getCommand() + "'" +
            "}";
    }
    
}