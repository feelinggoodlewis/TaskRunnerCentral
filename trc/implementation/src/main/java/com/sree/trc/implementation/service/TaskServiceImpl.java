package com.sree.trc.implementation.service;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.service.TaskService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger LOGGER = Logger.getLogger(TaskServiceImpl.class);

    @Override
    public List<String> getTaskTypes() {
        return null;
    }

    @Override
    public int createTask(String taskName, String taskType, List<Parameter> parameters) {
        return 0;
    }
}
