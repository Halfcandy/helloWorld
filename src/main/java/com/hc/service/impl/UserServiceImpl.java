package com.hc.service.impl;

import com.hc.dao.UserDao;
import com.hc.pojo.User;
import com.hc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User getUserById(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
