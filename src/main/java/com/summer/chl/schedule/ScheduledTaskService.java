package com.summer.chl.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat();

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每5s执行一次："+DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 56 15 ? * *")
    public void fixTimeExec() {
        System.out.println("指定时间执行："+DATE_FORMAT.format(new Date()));
    }
}
