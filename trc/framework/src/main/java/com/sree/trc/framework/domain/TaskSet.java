package com.sree.trc.framework.domain;

import java.util.List;

/**
 * Logical collection of tasks
 */
public abstract class TaskSet {

    private long taskSetId;
    private String taskSetName;

    private int taskSetExecutionSequenceNumber;
    private List<Task> taskList;

    public TaskSet(long taskSetId, String taskSetName, int taskSetExecutionSequenceNumber, List<Task> taskList) {
        this.taskSetId = taskSetId;
        this.taskSetName = taskSetName;
        this.taskSetExecutionSequenceNumber = taskSetExecutionSequenceNumber;
        this.taskList = taskList;
    }

    public long getTaskSetId() {
        return taskSetId;
    }

    public String getTaskSetName() {
        return taskSetName;
    }

    public int getTaskSetExecutionSequenceNumber() {
        return taskSetExecutionSequenceNumber;
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
