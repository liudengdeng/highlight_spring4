package com.summer.chl.mvc.anno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/anno", produces = "text/plain;charset=utf-8")
public class DemoAnnoController {
    @RequestMapping(produces = "text/plain;charset=utf-8")
    public @ResponseBody  String index(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=utf-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return request.getRequestURL() + str;
    }

    @RequestMapping(value = "/requestParam")
    @ResponseBody
    public String passRequestParam(long id, String name, HttpServletRequest request) {
        return id + name;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest request) {
        return obj.getId() + obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"})
    public @ResponseBody String remove(HttpServletRequest request) {
        return request.getRequestURL().toString();
    }

}
