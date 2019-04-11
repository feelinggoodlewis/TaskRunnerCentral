package com.sree.trc.framework.domain;

/**
 * Stores the snapshot information of a task pack execution
 */

public abstract class TaskPackRunSnapshot {

    private long taskPackRunId;
    private TaskPack taskPack;

    public TaskPackRunSnapshot(long taskPackRunId, TaskPack taskPack) {
        this.taskPackRunId = taskPackRunId;
        this.taskPack = taskPack;
    }

    public long getTaskPackRunId() {
        return taskPackRunId;
    }

    public TaskPack getTaskPack() {
        return taskPack;
    }

}
