package com.sree.trc.implementation.dao.service;

import com.sree.trc.framework.dao.TaskDao;
import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.implementation.dao.entity.Task;
import com.sree.trc.implementation.dao.entity.builder.ParameterBuilder;
import com.sree.trc.implementation.dao.entity.builder.TaskBuilder;
import com.sree.trc.implementation.dao.repository.TaskRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskDaoImpl implements TaskDao {

    private static final Logger LOGGER = Logger.getLogger(ParameterDaoImpl.class);

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public int createTask(String taskName, String taskType, List<Parameter> parameters) {
        Task task = new Task(taskName, taskType);
        List<com.sree.trc.implementation.dao.entity.Parameter> parameterList = ParameterBuilder.createDBParameterList(parameters);
        task.setParameterList(parameterList);
        taskRepository.save(task);
        LOGGER.info("Task of type " + taskType + " with Name " + taskName + " added to database");
        return 0;
    }

    @Override
    public List<com.sree.trc.framework.domain.Task> getAllTasks() {
        List<com.sree.trc.framework.domain.Task> taskList = TaskBuilder.buildTaskList(taskRepository.findAll());
        return taskList;
    }
}
