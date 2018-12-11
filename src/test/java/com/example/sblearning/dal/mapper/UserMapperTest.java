package com.example.sblearning.dal.mapper;

import com.example.sblearning.dal.dao.UserDao;
import com.example.sblearning.dal.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chentiming on 2018/12/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserDao userDao;

    @Test
    public void getById() throws Exception {
        User user = userDao.getByUserName("chentm");
        System.out.println(user.getPassword());
    }

}