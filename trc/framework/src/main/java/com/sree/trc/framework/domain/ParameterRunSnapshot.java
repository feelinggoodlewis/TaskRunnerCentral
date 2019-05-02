package com.sree.trc.framework.domain;

import java.util.UUID;

public class ParameterRunSnapshot {

    private UUID parameterRunSnapshotId;

    private Parameter parameter;

    public ParameterRunSnapshot(Parameter parameter) {
        this.parameter = parameter;
    }

    private TaskRunSnapshot taskRunSnapshot;

    private TaskPackRunSnapshot taskPackRunSnapshot;

    private TaskSetRunSnapshot taskSetRunSnapshot;

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public TaskRunSnapshot getTaskRunSnapshot() {
        return taskRunSnapshot;
    }

    public void setTaskRunSnapshot(TaskRunSnapshot taskRunSnapshot) {
        this.taskRunSnapshot = taskRunSnapshot;
    }

    public TaskPackRunSnapshot getTaskPackRunSnapshot() {
        return taskPackRunSnapshot;
    }

    public void setTaskPackRunSnapshot(TaskPackRunSnapshot taskPackRunSnapshot) {
        this.taskPackRunSnapshot = taskPackRunSnapshot;
    }

    public TaskSetRunSnapshot getTaskSetRunSnapshot() {
        return taskSetRunSnapshot;
    }

    public void setTaskSetRunSnapshot(TaskSetRunSnapshot taskSetRunSnapshot) {
        this.taskSetRunSnapshot = taskSetRunSnapshot;
    }

    public UUID getParameterRunSnapshotId() {
        return parameterRunSnapshotId;
    }

    public void setParameterRunSnapshotId(UUID parameterRunSnapshotId) {
        this.parameterRunSnapshotId = parameterRunSnapshotId;
    }
}
