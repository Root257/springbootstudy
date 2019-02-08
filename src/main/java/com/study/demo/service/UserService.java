package com.study.demo.service;
import com.github.pagehelper.PageInfo;
import com.study.demo.model.UserDomain;
import java.util.List;
public interface UserService {
    int addUser(UserDomain user);
    PageInfo<UserDomain> findAllUser(int pageNum,int pageSize);
    UserDomain findByUserName(String userName);
}
