package com.sree.trc.implementation.domain;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public class RelationalDBRunnerTask extends Task {
    public RelationalDBRunnerTask(long taskId, List<Parameter> ParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        super(ParameterList, taskName, editable, "Relational DB Runner Task");
    }

    public RelationalDBRunnerTask(String taskName, List<Parameter> parameterList) {
        super(taskName, parameterList);
    }
}
