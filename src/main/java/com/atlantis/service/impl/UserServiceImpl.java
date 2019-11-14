package com.atlantis.service.impl;

import com.atlantis.dao.UserDao;
import com.atlantis.domain.User;
import com.atlantis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User LoginUser(User user) {
        System.out.println("用户登录...");
        return userDao.LoginUser(user);
    }

    @Override
    public List<User> findAll() {
        System.out.println("查询所有用户...");
        return userDao.findAll();
    }
}
