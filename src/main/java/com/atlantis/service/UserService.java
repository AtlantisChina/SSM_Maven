package com.atlantis.service;

import com.atlantis.domain.User;
import java.util.List;

public interface UserService {
    // 用户登录
    public User LoginUser(User user);

    // 查询所有用户
    public List<User> findAll();
}
