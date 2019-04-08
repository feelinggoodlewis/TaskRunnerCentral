package com.sree.trcframework.domain;


public abstract class Parameter{

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
