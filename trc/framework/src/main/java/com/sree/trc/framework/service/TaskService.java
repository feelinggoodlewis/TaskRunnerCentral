package com.sree.trc.framework.service;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public interface TaskService {
    List<String> getTaskTypes();
    int createTask(String taskName, String taskType, List<Parameter> parameters);
    List<Task> getAllTasks();
}
