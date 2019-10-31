package com.lh.course.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController{
    @RequestMapping("/secondControllerAction1")
    public String firstMethod(Model model) throws Exception {
        model.addAttribute("msg", "这是 SecondController 的第一个方法");
        return "/jsp/first";
    }
    @RequestMapping("/secondControllerAction2")
    public String secondMethod(Model model) throws Exception {
        model.addAttribute("msg", "这是 SecondController 的第二个方法");
        return "/jsp/first";
    }
}