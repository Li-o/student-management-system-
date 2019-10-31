package com.lh.course.user2.service;
import com.lh.course.user2.model.User;

import java.util.List;

public interface UserService {

    //通过id查询
    public User findUserById(int userId);

    //添加
    public void addUser(User user);

    //修改
    public void updateUser(User user);

    //删除
    public void deleteUser(int userId);

    //查询所有
     List<User> findAllUsers();


}
