package com.sree.trcframework.domain;

import java.util.List;

public class TaskPack {

    private long taskPackId;
    private String taskPackName;
    private List<Parameter> taskPackParameterList;
    private List<TaskSet> taskSetList;

    public TaskPack(long taskPackId, String taskPackName, List<Parameter> taskPackParameterList, List<TaskSet> taskSetList) {
        this.taskPackId = taskPackId;
        this.taskPackName = taskPackName;
        this.taskPackParameterList = taskPackParameterList;
        this.taskSetList = taskSetList;
    }

    public long getTaskPackId() {
        return taskPackId;
    }

    public String getTaskPackName() {
        return taskPackName;
    }

    public List<Parameter> getTaskPackParameterList() {
        return taskPackParameterList;
    }

    public List<TaskSet> getTaskSetList() {
        return taskSetList;
    }
}
