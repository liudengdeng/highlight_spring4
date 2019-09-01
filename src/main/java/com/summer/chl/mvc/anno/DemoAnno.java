package com.summer.chl.mvc.anno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
@ResponseBody
public @interface DemoAnno {
    String[] value() default {};
    String[] produces() default {};
}
