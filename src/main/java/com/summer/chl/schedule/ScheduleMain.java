package com.summer.chl.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        ScheduledTaskService service = context.getBean(ScheduledTaskService.class);
//        service.reportCurrentTime();
//        service.fixTimeExec();
//        context.close();
    }
}
