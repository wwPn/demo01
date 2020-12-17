package com.offcn.demo01.controller;

import com.offcn.demo01.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
   private List<User> list=new ArrayList<User>();
    public UserController(){
        User user1=new User(1001L,"Lucy",18,"1111");
        User user2=new User(1001L,"xixi",18,"2222");
        User user3=new User(1001L,"gogo",18,"3333");
        User user4=new User(1001L,"TiTi",18,"4444");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
    }
    //查询所有用户信息
    @GetMapping("/")
    public List<User> getUseAll(){
        return list;
    }
    //查询单个用户信息
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        //根据id找就要遍历这个集合
        for (User user:list
        ){
           if (user.getId().longValue()==id.longValue()){
               return user;
           }
        }
        return null;
    }
    //添加用户
    @PostMapping("/")
    public String addUser(User user){
        list.add(user);
        return "add success";
    }
    //修改
    @PutMapping("/")
    public String updateUser(User user){
        for (User u:list
             ) {
            if(user.getId().longValue()==u.getId().longValue()){
                u.setName(user.getName());
                u.setAge(user.getAge());
                u.setMobile(user.getMobile());
               return "success";
            }
        }
        return "update error";
    }
    //删除
    @DeleteMapping("/{id}")
    public String deletuser(@PathVariable("id") long id){

        list.remove(getUserById(id));
        return "delete success";
    }
}
