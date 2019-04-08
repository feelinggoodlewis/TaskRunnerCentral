package com.sree.trcframework.domain;

public abstract class TaskRun {

    private long taskRunId;
    private Task task;
    private String environment;
    private boolean continueOnFailure;
    private int executionSequenceNumber;
    private boolean editable;
    private String runParameter;

    public TaskRun(long taskRunId, Task task, String environment, boolean continueOnFailure, int executionSequenceNumber, boolean editable, String runParameter) {
        this.taskRunId = taskRunId;
        this.task = task;
        this.environment = environment;
        this.continueOnFailure = continueOnFailure;
        this.executionSequenceNumber = executionSequenceNumber;
        this.editable = editable;
        this.runParameter = runParameter;
    }

    public TaskRun(long taskRunId, Task task, String environment) {
        this.taskRunId = taskRunId;
        this.task = task;
        this.environment = environment;
        this.continueOnFailure = task.isContinueOnFailure();
        this.executionSequenceNumber = task.getExecutionSequenceNumber();
        this.editable = task.isEditable();
        this.runParameter = task.getRunParameter();
    }

    public long getTaskRunId() {
        return taskRunId;
    }

    public Task getTask() {
        return task;
    }

    public String getEnvironment() {
        return environment;
    }

    public boolean isContinueOnFailure() {
        return continueOnFailure;
    }

    public int getExecutionSequenceNumber() {
        return executionSequenceNumber;
    }

    public boolean isEditable() {
        return editable;
    }

    public String getRunParameter() {
        return runParameter;
    }
}
