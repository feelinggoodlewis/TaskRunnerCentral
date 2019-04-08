package com.sree.trcframework.domain;

import java.util.List;

public class TaskSet {

    private long taskSetId;
    private String taskSetName;
    private List<Parameter> taskSetParameterList;
    private int taskSetExecutionSequenceNumber;
    private List<Task> taskList;

    public TaskSet(long taskSetId, String taskSetName, List<Parameter> taskSetParameterList, int taskSetExecutionSequenceNumber, List<Task> taskList) {
        this.taskSetId = taskSetId;
        this.taskSetName = taskSetName;
        this.taskSetParameterList = taskSetParameterList;
        this.taskSetExecutionSequenceNumber = taskSetExecutionSequenceNumber;
        this.taskList = taskList;
    }

    public long getTaskSetId() {
        return taskSetId;
    }

    public String getTaskSetName() {
        return taskSetName;
    }

    public List<Parameter> getTaskSetParameterList() {
        return taskSetParameterList;
    }

    public int getTaskSetExecutionSequenceNumber() {
        return taskSetExecutionSequenceNumber;
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
