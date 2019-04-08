package com.sree.trcframework.domain;

import com.sree.trcframework.domain.builder.TaskSetRunCollectionBuilder;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TaskSetRun {
    private long taskSetRunId;
    private TaskSet taskSet;
    private ConcurrentHashMap<Integer, List<TaskRun>> taskRunCollection;
    private int taskSetExecutionSequenceNumber;

    public TaskSetRun(long taskSetRunId, TaskSet taskSet) {
        this.taskSetRunId = taskSetRunId;
        this.taskSet = taskSet;
        this.taskSetExecutionSequenceNumber = taskSet.getTaskSetExecutionSequenceNumber();
        this.taskRunCollection = TaskSetRunCollectionBuilder.buildCollection();
    }

    public long getTaskSetRunId() {
        return taskSetRunId;
    }

    public TaskSet getTaskSet() {
        return taskSet;
    }

    public ConcurrentHashMap<Integer, List<TaskRun>> getTaskRunCollection() {
        return taskRunCollection;
    }
}
