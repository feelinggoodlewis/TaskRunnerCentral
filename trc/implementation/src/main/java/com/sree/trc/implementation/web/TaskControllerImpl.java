package com.sree.trc.implementation.web;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;
import com.sree.trc.framework.service.TaskService;
import com.sree.trc.framework.web.TaskController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TaskControllerImpl implements TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/welcome")
    public String index() {
        return "Greetings from TRC!";
    }

    @Override
    @RequestMapping(value = "/task/create", method = POST)
    public void createTask(String taskName, String taskType, @RequestBody List<Parameter> parameterList) {
        taskService.createTask(taskName, taskType, parameterList);
    }

    @Override
    @RequestMapping(value = "/task/types", method = GET)
    public List<String> getTaskTypes(){
        return taskService.getTaskTypes();
    }

    @Override
    @RequestMapping(value = "/task/all", method = GET)
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
}
