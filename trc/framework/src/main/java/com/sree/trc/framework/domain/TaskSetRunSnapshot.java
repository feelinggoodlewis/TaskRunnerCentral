package com.sree.trc.framework.domain;

/**
 * Stores the snapshot information of a task set execution
 */
public class TaskSetRunSnapshot {
    private long taskSetRunSnapshotId;
    private TaskSet taskSet;


    public TaskSetRunSnapshot(long taskSetRunSnapshotId, TaskSet taskSet) {
        this.taskSetRunSnapshotId = taskSetRunSnapshotId;
        this.taskSet = taskSet;
    }

    public long getTaskSetRunSnapshotId() {
        return taskSetRunSnapshotId;
    }

    public TaskSet getTaskSet() {
        return taskSet;
    }

}
