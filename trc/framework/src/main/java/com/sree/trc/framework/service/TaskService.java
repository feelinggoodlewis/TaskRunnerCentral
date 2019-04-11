package com.sree.trc.framework.service;

import java.util.List;

public interface TaskService {
    List<String> getTaskTypes();
    void createTask(String taskName, String taskType);
}
