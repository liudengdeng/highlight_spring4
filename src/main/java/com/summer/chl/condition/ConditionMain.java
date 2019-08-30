package com.summer.chl.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;

public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = context.getBean(ListService.class);
        System.out.println(service.showListCmd());
    }
}
