package com.sree.trc.implementation.service;

import com.sree.trc.framework.dao.TaskDao;
import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;
import com.sree.trc.framework.service.TaskService;
import com.sree.trc.implementation.domain.TaskType;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger LOGGER = Logger.getLogger(TaskServiceImpl.class);

    @Autowired
    private TaskDao taskDao;

    @Override
    public List<String> getTaskTypes() {
        return Arrays.stream(TaskType.values()).map(taskType -> taskType.toString()).collect(Collectors.toList());
    }

    @Override
    public int createTask(String taskName, String taskType, List<Parameter> parameters) {
        return taskDao.createTask(taskName, taskType, parameters);
    }

    @Override
    public List<Task> getAllTasks(){
        return taskDao.getAllTasks();
    }
}
