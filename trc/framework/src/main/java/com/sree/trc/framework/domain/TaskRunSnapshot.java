package com.sree.trc.framework.domain;

/**
 * Stores the snapshot information of a task execution
 */
public abstract class TaskRunSnapshot {

    private long taskRunSnapshotId;
    private Task task;
    private String environment;
    private boolean continueOnFailure;
    private int executionSequenceNumber;
    private boolean editable;
    private String runParameter;
    private RunStatus runStatus;

    public TaskRunSnapshot(long taskRunSnapshotId, Task task, String environment, boolean continueOnFailure, int executionSequenceNumber, boolean editable, String runParameter) {
        this.taskRunSnapshotId = taskRunSnapshotId;
        this.task = task;
        this.environment = environment;
        this.continueOnFailure = continueOnFailure;
        this.executionSequenceNumber = executionSequenceNumber;
        this.editable = editable;
        this.runParameter = runParameter;
    }

    public TaskRunSnapshot(long taskRunSnapshotId, Task task, String environment) {
        this.taskRunSnapshotId = taskRunSnapshotId;
        this.task = task;
        this.environment = environment;
        this.continueOnFailure = task.isContinueOnFailure();
        this.executionSequenceNumber = task.getExecutionSequenceNumber();
        this.editable = task.isEditable();
        this.runParameter = task.getRunParameter();
    }

    public long getTaskRunSnapshotId() {
        return taskRunSnapshotId;
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

    public RunStatus getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(RunStatus runStatus) {
        this.runStatus = runStatus;
    }
}
