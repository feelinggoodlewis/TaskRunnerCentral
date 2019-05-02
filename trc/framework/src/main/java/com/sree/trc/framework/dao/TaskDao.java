package com.sree.trc.framework.dao;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public interface TaskDao {
    int createTask(String taskName, String TaskType, List<Parameter> parameters);

    List<Task> getAllTasks();
}
