package com.example.sblearning.service;

import com.example.sblearning.dal.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by chentiming on 2018/12/9.
 */
public interface UserService {
    User getUserByName(String name);
}
