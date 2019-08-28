package com.summer.chl.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println(111111111);
    }
}
