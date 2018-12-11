package com.example.sblearning.dal.dao;

import com.example.sblearning.dal.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by chentiming on 2018/12/9.
 */
@Repository
public interface UserDao {
    @Select("select * from user where username = #{username}")
    User getByUserName(String username);
}
