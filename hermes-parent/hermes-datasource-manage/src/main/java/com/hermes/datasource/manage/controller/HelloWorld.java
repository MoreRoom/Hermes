package com.hermes.datasource.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/7/30
 */
@Controller
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        return "demo";
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "main/desktop";
    }

}
