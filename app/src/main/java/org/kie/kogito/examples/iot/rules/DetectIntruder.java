package org.kie.kogito.examples.iot.rules;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStream;
import org.kie.kogito.rules.RuleUnitMemory;

public class DetectIntruder implements RuleUnitMemory {
    private DataStream<Object> updates = DataSource.createStream();
    private DataStream<String> result = DataSource.createStream();
    public DataStream<Object> getUpdates() {
        return updates;
    }
    public DataStream<String> getResult() {
        return result;
    }

}