package com.sree.trc.implementation.dao.entity;

import com.google.common.collect.Lists;
import com.sree.trc.implementation.domain.TaskType;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "TASK")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;

    @OneToMany( mappedBy = "task",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Parameter> ParameterList = Lists.newArrayList();

    private String taskName;

    @Enumerated(EnumType.STRING)
    @Column(length = 25)
    private TaskType taskType;

    private Date createdDateTime;

    private Date modifiedDateTime;


    private Boolean isDeleted = false;

    public Task(String taskName, String taskType) {
        this.taskName = taskName;
        this.taskType = TaskType.valueOf(taskType);
    }

    public Task(){}

    public List<Parameter> getParameterList() {
        return ParameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        ParameterList = parameterList;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(Date modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getTaskName() {
        return taskName;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
