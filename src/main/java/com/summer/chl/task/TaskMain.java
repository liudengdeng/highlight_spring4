package com.summer.chl.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Async;

public class TaskMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            bean.execAsyncTask(i);
            bean.execAsyncTaskPlus(i);
        }
        context.close();
    }
}
