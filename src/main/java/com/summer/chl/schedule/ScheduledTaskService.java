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
        System.out.println("ÿ5sִ��һ�Σ�"+DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "0 56 15 ? * *")
    public void fixTimeExec() {
        System.out.println("ָ��ʱ��ִ�У�"+DATE_FORMAT.format(new Date()));
    }
}
