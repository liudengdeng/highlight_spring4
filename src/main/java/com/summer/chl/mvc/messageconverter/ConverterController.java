package com.summer.chl.mvc.messageconverter;

import com.summer.chl.mvc.anno.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = "application/x-summer")
    public @ResponseBody DemoObj convert(@RequestBody DemoObj obj) {
        return obj;
    }
}
