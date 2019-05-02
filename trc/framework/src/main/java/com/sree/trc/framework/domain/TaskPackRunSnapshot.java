package com.sree.trc.framework.domain;

import java.util.UUID;

/**
 * Stores the snapshot information of a task pack execution
 */

public abstract class TaskPackRunSnapshot {

    private UUID taskPackRunId;
    private TaskPack taskPack;

    public TaskPackRunSnapshot(TaskPack taskPack) {
        this.taskPack = taskPack;
    }

    public TaskPack getTaskPack() {
        return taskPack;
    }

    public UUID getTaskPackRunId() {
        return taskPackRunId;
    }

    public void setTaskPackRunId(UUID taskPackRunId) {
        this.taskPackRunId = taskPackRunId;
    }
}
