package com.sree.trc.framework.business;

import com.sree.trc.framework.domain.TaskRunSnapshot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskRunExecutorService {

    private int numberOfConsumerThreads;
    private int numberofProducerThreads;


    public TaskRunExecutorService(int numberOfConsumerThreads, int numberofProducerThreads) {
        this.numberOfConsumerThreads = numberOfConsumerThreads;
        this.numberofProducerThreads = numberofProducerThreads;
    }

    public void executeTaskRun(){
        try
        {
            TaskRunBroker broker = new TaskRunBroker();

            ExecutorService producerExecutorService = Executors.newFixedThreadPool(numberofProducerThreads);
            ExecutorService consumenExecutorService = Executors.newFixedThreadPool(numberOfConsumerThreads);

            for(int i = 0; i < numberofProducerThreads; i++){
                producerExecutorService.submit(new TaskRunSnapshotProducer(broker, i));
            }

            for(int i = 0; i < numberOfConsumerThreads; i++){
                consumenExecutorService.submit(new TaskRunSnapshotCustomer(broker, i));
            }

            producerExecutorService.shutdown();
            consumenExecutorService.shutdown();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
