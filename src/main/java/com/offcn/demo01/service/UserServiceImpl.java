package com.offcn.demo01.service;

import com.offcn.demo01.entity.User;
import com.offcn.demo01.mapper.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> getUserAll() {
        List<User> list = jdbcTemplate.query("select * from user ", new BeanPropertyRowMapper(User.class));
        return list;
    }
    @Override
    public User getUserById(Long id) {
        User user = jdbcTemplate.queryForObject
                ("select * from user where id=?",new BeanPropertyRowMapper<>(User.class),id);
        return user;
    }
    @Override
    public void addUser(User user) {
        jdbcTemplate.update
                ("insert into  user(name,age,mobile) values (?,?,?)",user.getName(),user.getAge(),user.getMobile());

    }
    @Override
    public void updateUser(User user) {
     jdbcTemplate.update
             ("update user set name=?,age=?,mobile=? where id=?",user.getName(),user.getAge(),user.getMobile(),user.getId());
    }
    @Override
    public void deleteUserById(Long id) {
   jdbcTemplate.update
           ("delete from user where id=? ",id);
    }
}
