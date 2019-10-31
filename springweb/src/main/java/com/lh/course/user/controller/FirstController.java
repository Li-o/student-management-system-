package com.lh.course.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//注解方式
@Controller
public class FirstController {
    //请求映射地址
    @RequestMapping("/firstController")
    public String handleRequest(Model model) throws Exception {
        model.addAttribute("msg", "这是我的第一个 Spring MVC 程序");

        return "/jsp/first";//逻辑视图名称
    }
}