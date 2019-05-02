package com.sree.trc.implementation.dao.entity.builder;

import com.google.common.collect.ImmutableList;
import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;
import com.sree.trc.implementation.domain.ConsoleRunnerTask;
import com.sree.trc.implementation.domain.FtpRunnerTask;
import com.sree.trc.implementation.domain.RelationalDBRunnerTask;
import com.sree.trc.implementation.domain.TaskType;

import java.util.List;
import java.util.stream.Collectors;

import static com.sree.trc.implementation.dao.entity.builder.ParameterBuilder.createParameterListFromDB;

public class TaskBuilder {
    public static List<Task> buildTaskList(Iterable<com.sree.trc.implementation.dao.entity.Task> tasksInDb) {
        List<com.sree.trc.implementation.dao.entity.Task> allTasksInDb = ImmutableList.copyOf(tasksInDb);
        List<Task> allTasks = allTasksInDb.stream()
                .map( activeTask -> createTask(activeTask.getTaskName(), activeTask.getTaskType(), createParameterListFromDB(activeTask.getParameterList())))
        .collect(Collectors.toList());
        return allTasks;
    }

    private static Task createTask(String taskName, TaskType taskType, List<Parameter> parameterList) {
        Task taskToReturn = null;

        switch(taskType){
            case CONSOLE_RUNNER:
                taskToReturn = new ConsoleRunnerTask(taskName, parameterList);
                break;
            case FTP_RUNNER:
                taskToReturn = new FtpRunnerTask(taskName, parameterList);
                break;
            case RELATIONAL_DB_RUNNER:
                taskToReturn = new RelationalDBRunnerTask(taskName, parameterList);
                break;
            case MONGO_DB_RUNNER:
            default:
                break;
        }
        return taskToReturn;
    }
}
