package com.offcn.demo01.mapper;

import com.offcn.demo01.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    public List<User> getUserAll();  //查询所有用户
    public User getUserById(Long id);   //查询一个用户
    public void addUser(User user);  //添加用户
    public void updateUser(User user); //修改
    public void deleteUserById(Long id); //删除用户
}
