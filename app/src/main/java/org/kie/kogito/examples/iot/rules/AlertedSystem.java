package org.kie.kogito.examples.iot.rules;

import org.kie.kogito.examples.iot.data.DoorSensorData;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStream;
import org.kie.kogito.rules.RuleUnitMemory;

public class AlertedSystem implements RuleUnitMemory {
    private DataStream<DoorSensorData> updates = DataSource.createStream();
    private DataStream<String> result = DataSource.createStream();
    public DataStream<DoorSensorData> getUpdates() {
        return updates;
    }
    public DataStream<String> getResult() {
        return result;
    }

}