package com.study.demo.dao;

import com.study.demo.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UserDao {
    int insert(UserDomain record);
    List<UserDomain> selectUsers();
    UserDomain findByUserName(String userName);
}
