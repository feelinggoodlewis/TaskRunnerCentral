package com.sree.trc.implementation.domain;

import com.sree.trc.framework.domain.Parameter;
import com.sree.trc.framework.domain.Task;

import java.util.List;

public class FtpRunnerTask extends Task {

    public FtpRunnerTask(long taskId, List<Parameter> ParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        super(ParameterList, taskName, editable, "FTP Runner Task");
    }

    public FtpRunnerTask(String taskName, List<Parameter> parameterList) {
        super(taskName, parameterList);
    }
}
