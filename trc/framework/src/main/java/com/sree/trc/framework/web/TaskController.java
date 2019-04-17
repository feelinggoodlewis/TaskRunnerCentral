package com.sree.trc.framework.web;

import com.sree.trc.framework.domain.Parameter;

import java.util.List;

public interface TaskController {

    void createTask(String taskName, String taskType, List<Parameter> parameterList);
}
