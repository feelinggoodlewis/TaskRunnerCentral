package com.sree.trc.framework.service;

import org.apache.log4j.Logger;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private static final Logger LOGGER = Logger.getLogger(TaskServiceImpl.class);

    @Override
    public List<String> getTaskTypes() {
        return null;
    }

    @Override
    public void createTask(String taskName, String taskType) {

    }
}
