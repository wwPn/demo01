package com.offcn.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${myip}")
    private String myip; //把muip注入给了变量名
    @Value("${myport}")
    private String myport;

    @RequestMapping("/hello")
    public String hello(){
        return  "刘老根大舞台，有胆你就来";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("看login");
        return "login";
    }
    //@RequestMapping("/getValue")
    @GetMapping("/getValue")  //这两个都可以
    public String getMyValue(){
        return myip+":"+myport;
    }
}
