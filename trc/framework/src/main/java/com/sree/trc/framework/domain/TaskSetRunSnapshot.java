package com.sree.trc.framework.domain;

import java.util.UUID;

/**
 * Stores the snapshot information of a task set execution
 */
public class TaskSetRunSnapshot {

    private UUID taskSetRunSnapshotId;
    private TaskSet taskSet;

    public TaskSetRunSnapshot(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    public TaskSet getTaskSet() {
        return taskSet;
    }

    public UUID getTaskSetRunSnapshotId() {
        return taskSetRunSnapshotId;
    }

    public void setTaskSetRunSnapshotId(UUID taskSetRunSnapshotId) {
        this.taskSetRunSnapshotId = taskSetRunSnapshotId;
    }

    public void setTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }
}
