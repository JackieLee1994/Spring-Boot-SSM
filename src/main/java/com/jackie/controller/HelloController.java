package com.jackie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lwxzbh on 2017/7/20.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    private String sayHello(){
        return "Hello SpringBoot";
    }

}
