package com.lh.course.user2.controller;

import com.lh.course.user2.model.User;
import com.lh.course.user2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //查看所有人员
    @RequestMapping("/touserlist")
    public String userlist(Model model){
        //TODO:调用userService从数据库获得所有用户
          List<User> users=userService.findAllUsers();
//        测试数据
//        User user1=new User();
//        user1.setUserId(1);
//        user1.setUserName("张三");
//        user1.setUserNo("16000001");
//        user1.setSex("男");
//        user1.setClazz("物联1601");
//
//        User user2=new User();
//        user2.setUserId(2);
//        user2.setUserName("李四");
//        user2.setUserNo("16000002");
//        user2.setSex("女");
//        user2.setClazz("物联1602");
//
//        List<User> users =new ArrayList<>();
//        users.add(user1);
//        users.add(user2);

        //把用户信息放进model
        model.addAttribute("userlist",users);
        //跳转到用户列表jsp页面
        return "/jsp/userlist";
    }

    //跳转到添加用户jsp页面
    @RequestMapping("/touseradd")
    public String touseradd(Model model) {

        //去到添加页面
        return "/jsp/useradd";
    }

    //在jsp页面添加完用户信息，点击保存，把数据保存到数据库
    @RequestMapping("/useradd")
    public String useradd(User user){
        //TODO:调用userService把数据保存到数据库
        userService.addUser(user);
        //其中，user使用SpringMVC的数据绑定功能，获得从jsp页面传过来的数据
        //可以打印到控制台，看数据是否正确
        //System.out.println(user.toString());

        //添加完用户信息，重定向到用户列表页面
        return "redirect:touserlist";
    }


    //修改用户信息前，先通过id获得要修改的用户信息
    @RequestMapping("/touseredit")
    public String touseredit(Integer userId, Model model){
        //TODO:调用userService从数据库获得用户信息
        User user = userService.findUserById(userId);
        //其中，userId使用SpringMVC的数据绑定功能，获得从jsp页面传过来的数据
        //可以打印到控制台，看数据是否正确
        System.out.println("userId=" + userId);

//        测试数据
//        User user=new User();
//        user.setUserId(1);
//        user.setUserName("张三");
//        user.setUserNo("16000001");
//        user.setSex("男");
//        user.setClazz("物联1601");

        //把要修改的用户信息放进model
        model.addAttribute("user",user);
        //去到修改页面
        return "/jsp/useredit";
    }

    //在jsp页面修改完用户信息，点击保存，把修改保存到数据库
    @RequestMapping("/useredit")
    public String useredit(User user){
        //TODO:调用userService把修改后的数据保存到数据库
        userService.updateUser(user);
        //其中，user使用SpringMVC的数据绑定功能，获得从jsp页面传过来的数据
        //可以打印到控制台，看数据是否正确
//        System.out.println(user.toString());

        //修改完用户信息，重定向到用户列表页面
        return "redirect:touserlist";
    }

    //删除用户
    @RequestMapping("/userdel")
    public String userdel(Integer userId) {
        //TODO:调用userService从数据库删除用户
        userService.deleteUser(userId);
        //其中，userId使用SpringMVC的数据绑定功能，获得从jsp页面传过来的数据
        //可以打印到控制台，看数据是否正确
        System.out.println("userId=" + userId);

        //删除完用户，重定向到用户列表页面
        return "redirect:touserlist";
    }
}
