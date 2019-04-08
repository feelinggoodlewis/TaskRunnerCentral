package com.sree.trcframework.domain;

import com.sree.trcframework.domain.builder.TaskPackRunCollectionBuilder;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Stores the snapshot information of a task pack execution
 */
public class TaskPackRun {

    private long taskPackRunId;
    private TaskPack taskPack;
    private ConcurrentHashMap<Integer, List<TaskSetRun>> taskSetRunCollection;

    public TaskPackRun(long taskPackRunId, TaskPack taskPack) {
        this.taskPackRunId = taskPackRunId;
        this.taskPack = taskPack;
        this.taskSetRunCollection = TaskPackRunCollectionBuilder.buildTaskPack();
    }

    public long getTaskPackRunId() {
        return taskPackRunId;
    }

    public TaskPack getTaskPack() {
        return taskPack;
    }

    public ConcurrentHashMap<Integer, List<TaskSetRun>> getTaskSetRunCollection() {
        return taskSetRunCollection;
    }
}
