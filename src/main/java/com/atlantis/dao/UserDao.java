package com.atlantis.dao;

import com.atlantis.domain.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {
    // 用户登录
    public User LoginUser(User user);

    // 查询所有用户
    public List<User> findAll();
}
