package com.sree.trc.framework.service;

import com.sree.trc.framework.domain.Parameter;

import java.util.List;

public interface TaskService {
    List<String> getTaskTypes();
    int createTask(String taskName, String taskType, List<Parameter> parameters);
}
