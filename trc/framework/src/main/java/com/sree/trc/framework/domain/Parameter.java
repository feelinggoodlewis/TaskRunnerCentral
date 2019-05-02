package com.sree.trc.framework.domain;

import java.text.ParseException;
import java.util.UUID;

/**
 * Any parameter that would be used while executing a task, task set or task pack
 */

public class Parameter{

    private UUID parameterId;
    private String parameterName;
    private String parameterValue;
    private ParameterType parameterType;

    public Parameter(String parameterName, String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    public Parameter(){}

    public String getParameterName() {
        return parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    public void setParameterType(ParameterType parameterType) {
        this.parameterType = parameterType;
    }

    public UUID getParameterId() {
        return parameterId;
    }

    public void setParameterId(UUID parameterId) {
        this.parameterId = parameterId;
    }
}
