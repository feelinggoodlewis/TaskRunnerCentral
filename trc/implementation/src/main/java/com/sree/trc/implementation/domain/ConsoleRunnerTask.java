package com.sree.trc.implementation.domain;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public class ConsoleRunnerTask extends Task {

    public ConsoleRunnerTask(long taskId, List<Parameter> ParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        super(taskId, ParameterList, taskName, editable, continueOnFailure, executionSequenceNumber, runParameter);
    }

}
