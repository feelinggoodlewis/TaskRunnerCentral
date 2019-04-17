package com.sree.trc.framework.domain;

import java.util.List;

/**
 * Backbone of TRC. This is the class that is executed as part of every job.
 */

public abstract class Task {

    private long taskId;
    private String taskName;
    private List<Parameter> ParameterList;
    private boolean editable;
    private boolean continueOnFailure;
    private int executionSequenceNumber;
    private String runParameter;

    public Task(long taskId, List<Parameter> ParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        this.taskId = taskId;
        this.ParameterList = ParameterList;
        this.taskName = taskName;
        this.editable = editable;
        this.continueOnFailure = continueOnFailure;
        this.executionSequenceNumber = executionSequenceNumber;
        this.runParameter = runParameter;
    }

    public long getTaskId() {
        return taskId;
    }

    public List<Parameter> getParameterList() {
        return ParameterList;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isEditable() {
        return editable;
    }

    public boolean isContinueOnFailure() {
        return continueOnFailure;
    }

    public int getExecutionSequenceNumber() {
        return executionSequenceNumber;
    }

    public String getRunParameter() {
        return runParameter;
    }
}
