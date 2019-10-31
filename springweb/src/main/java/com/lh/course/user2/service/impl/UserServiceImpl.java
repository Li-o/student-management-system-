package com.lh.course.user2.service.impl;

import com.lh.course.user2.dao.UserMapper;
import com.lh.course.user2.model.User;
import com.lh.course.user2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //自动绑定注入usermapper对象
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }
}
