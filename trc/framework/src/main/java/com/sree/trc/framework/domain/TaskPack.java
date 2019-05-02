package com.sree.trc.framework.domain;
import java.util.List;
import java.util.UUID;

/**
 * Logical collection of Task Sets
 */
public abstract class TaskPack {

    private UUID taskPackId;
    private String taskPackName;
    List<Parameter> parameterList;

    private List<TaskSet> taskSetList;

    public TaskPack(String taskPackName, List<Parameter> taskPackParameterList) {
        this.taskPackName = taskPackName;
        this.parameterList = taskPackParameterList;
    }

    public String getTaskPackName() {
        return taskPackName;
    }

    public List<TaskSet> getTaskSetList() {
        return taskSetList;
    }

    public void setTaskSetList(List<TaskSet> taskSetList) {
        this.taskSetList = taskSetList;
    }

    public List<Parameter> getParameterList() {
        return parameterList;
    }
}
