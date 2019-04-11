package com.sree.trc.framework.domain;
import java.util.List;

/**
 * Logical collection of Task Sets
 */
public abstract class TaskPack {

    private long taskPackId;
    private String taskPackName;

    private List<TaskSet> taskSetList;

    public TaskPack(long taskPackId, String taskPackName, List<Parameter> taskPackParameterList, List<TaskSet> taskSetList) {
        this.taskPackId = taskPackId;
        this.taskPackName = taskPackName;
        this.taskSetList = taskSetList;
    }

    public long getTaskPackId() {
        return taskPackId;
    }

    public String getTaskPackName() {
        return taskPackName;
    }

    public List<TaskSet> getTaskSetList() {
        return taskSetList;
    }
}
