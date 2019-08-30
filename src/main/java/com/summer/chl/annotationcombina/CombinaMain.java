package com.summer.chl.annotationcombina;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CombinaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CombinaConfig.class);
        CombinaService service = context.getBean(CombinaService.class);
        service.printResult();
        context.close();
    }
}
