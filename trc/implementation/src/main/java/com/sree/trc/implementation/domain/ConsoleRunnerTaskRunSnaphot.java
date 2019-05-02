package com.sree.trc.implementation.domain;

import com.sree.trc.framework.domain.Task;
import com.sree.trc.framework.domain.TaskRunSnapshot;

public class ConsoleRunnerTaskRunSnaphot extends TaskRunSnapshot {
    public ConsoleRunnerTaskRunSnaphot(Task task, String environment, boolean continueOnFailure, int executionSequenceNumber, boolean editable, String runParameter) {
        super(task, environment, continueOnFailure, executionSequenceNumber, editable, runParameter);
    }
}
