package com.example.sblearning.service.impl;

import com.example.sblearning.dal.dao.UserDao;
import com.example.sblearning.dal.entity.User;
import com.example.sblearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chentiming on 2018/12/9.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User getUserByName(String name) {

        return userDao.getByUserName(name);
    }
}
