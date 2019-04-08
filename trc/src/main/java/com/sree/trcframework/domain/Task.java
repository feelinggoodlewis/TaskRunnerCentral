package com.sree.trcframework.domain;

import java.util.List;

public abstract class Task {

    private long taskId;
    private List<TaskParameter> taskParameterList;
    private String taskName;
    private boolean editable;
    private boolean continueOnFailure;
    private int executionSequenceNumber;
    private String runParameter;

    public Task(long taskId, List<TaskParameter> taskParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        this.taskId = taskId;
        this.taskParameterList = taskParameterList;
        this.taskName = taskName;
        this.editable = editable;
        this.continueOnFailure = continueOnFailure;
        this.executionSequenceNumber = executionSequenceNumber;
        this.runParameter = runParameter;
    }

    public long getTaskId() {
        return taskId;
    }

    public List<TaskParameter> getTaskParameterList() {
        return taskParameterList;
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
