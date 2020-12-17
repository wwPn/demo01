package com.offcn.demo01.controller;

import com.offcn.demo01.entity.UserBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({UserBody.class})
public class TestBody {
   @Autowired
   private UserBody userBody;
   @GetMapping("/getUser")
   public String getUser(){
       return userBody.toString();
   }
}
