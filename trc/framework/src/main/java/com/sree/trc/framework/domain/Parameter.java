package com.sree.trc.framework.domain;

/**
 * Any parameter that would be used while executing a task, task set or task pack
 */

public class Parameter{

    private long parameterId;
    private String parameterName;
    private String parameterValue;

    public long getParameterId() {
        return parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }
}
