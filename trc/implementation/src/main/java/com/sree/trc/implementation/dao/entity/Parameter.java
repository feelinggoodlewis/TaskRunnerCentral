package com.sree.trc.implementation.dao.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name="PARAMETER")
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer parameterId;

    private String parameterValue;

    private String parameterName;

    private Date createdDateTime;

    private Date modifiedDateTime;

    private Boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taskId")
    private Task task;

    public Parameter(){ }

    public Parameter(Integer parameterId, String parameterName, String parameterValue) {
        this(parameterName, parameterValue);
        this.parameterId = parameterId;
    }

    public Parameter(String parameterName, String parameterValue) {
        this.parameterValue = parameterValue;
        this.parameterName = parameterName;
        this.createdDateTime = new Date(Calendar.getInstance().getTime().getTime());
        this.modifiedDateTime = new Date(Calendar.getInstance().getTime().getTime());
        this.isDeleted = false;
    }
    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
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

    @Override
    public String toString() {
        return "Parameter{" +
                "parameterId=" + parameterId +
                ", parameterValue='" + parameterValue + '\'' +
                ", parameterName='" + parameterName + '\'' +
                '}';
    }
}
