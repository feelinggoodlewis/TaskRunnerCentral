package com.sree.trc.framework.domain;

import java.util.List;
import java.util.UUID;

/**
 * Backbone of TRC. This is the class that is executed as part of every job.
 */

public abstract class Task {

    private UUID taskId;
    private String taskName;
    private String taskDescription;
    private List<Parameter> ParameterList;
    private boolean editable;


    public Task(List<Parameter> ParameterList, String taskName, boolean editable, String taskDescription) {
        this.ParameterList = ParameterList;
        this.taskName = taskName;
        this.editable = editable;
        this.taskDescription = taskDescription;
    }

    public Task(String taskName, List<Parameter> parameterList){
        this(parameterList, taskName, true, "");
    }

    public List<Parameter> getParameterList() {
        return ParameterList;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isEditable() {
        return editable;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }
}
