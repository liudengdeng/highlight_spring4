package com.summer.chl.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.summer.chl.schedule")
@EnableScheduling
public class ScheduleConfig {
}
