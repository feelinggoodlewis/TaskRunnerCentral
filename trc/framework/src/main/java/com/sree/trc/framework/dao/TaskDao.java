package com.sree.trc.framework.dao;

import com.sree.trc.framework.domain.Parameter;

import java.util.List;

public interface TaskDao {
    int createTask(String taskName, String TaskType, List<Parameter> parameters);
}
