package com.sree.trc.implementation.domain;

import com.microsoft.sqlserver.jdbc.StringUtils;
import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public class ConsoleRunnerTask extends Task {

    public ConsoleRunnerTask(List<Parameter> ParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        super(ParameterList, taskName, editable, "Console Runner task");
        ConsoleRunnerTaskRunSnaphot consoleRunnerTaskRunSnapshot = new ConsoleRunnerTaskRunSnaphot(this,
                StringUtils.EMPTY, continueOnFailure, executionSequenceNumber, editable, runParameter);

    }

    public ConsoleRunnerTask(String taskName, List<Parameter> parameterList) {
        super(taskName, parameterList);
    }
}
