package com.summer.chl.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add() {
        System.out.println(22222222);
    }
    public void update() {
        System.out.println(33333333);
    }
}
