package com.summer.chl.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async
    public void execAsyncTask(Integer i) {
        System.out.println("执行异步任务:" + i);

    }
    @Async
    public void execAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1:" + (i + 1));

    }
}
