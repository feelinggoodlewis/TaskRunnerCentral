package com.sree.trc.framework.domain;

import java.util.List;
import java.util.UUID;

/**
 * Logical collection of tasks
 */
public abstract class TaskSet {

    private UUID taskSetId;
    private String taskSetName;
    private List<Task> taskList;
    private List<Parameter> taskSetParameterList;

    public TaskSet(String taskSetName, List<Task> taskList, List<Parameter> parameterList) {
        this.taskSetName = taskSetName;
        this.taskList = taskList;
        this.taskSetParameterList = parameterList;
    }

    public String getTaskSetName() {
        return taskSetName;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public List<Parameter> getTaskSetParameterList() {
        return taskSetParameterList;
    }

    public UUID getTaskSetId() {
        return taskSetId;
    }

    public void setTaskSetId(UUID taskSetId) {
        this.taskSetId = taskSetId;
    }
}
