package com.summer.chl.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService bean = context.getBean(DemoAnnotationService.class);
        DemoMethodService bean1 = context.getBean(DemoMethodService.class);
        bean.add();
        bean1.update();
        context.close();
    }
}
