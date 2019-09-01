package com.summer.chl.mvc.advice;

import com.summer.chl.mvc.anno.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
        System.out.println("================>" + obj.getId() + obj.getName());
        throw new IllegalArgumentException("抱歉，参数有误" + "来自@ModelAttribute:" + msg);
    }
}
