package com.offcn.demo01.controller;

import com.offcn.demo01.entity.User;
import com.offcn.demo01.mapper.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user2")
public class UserController2 {
    @Autowired
    private UserService userService;
    //查询所有用户信息
    @GetMapping("/")
    public List<User> getUseAll(){
        return userService.getUserAll();
    }
    //查询单个用户信息
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
    //添加用户
    @PostMapping("/")
    public String addUser(User user){
       userService.addUser(user);
        return "add success";
    }
    //修改
    @PutMapping("/")
    public String updateUser(User user){
        userService.updateUser(user);
        return "success";
    }
    //删除
    @DeleteMapping("/{id}")
    public String deletuser(@PathVariable("id") long id){
        userService.deleteUserById(id);
        return "delete success";
    }
}
