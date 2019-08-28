package com.summer.chl.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.summer.chl.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
