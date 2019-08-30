package com.summer.chl.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev profile");
    }

    @Bean
    @Profile("prd")
    public TestBean prdTestBean() {
        return new TestBean("prd profile");
    }
}
