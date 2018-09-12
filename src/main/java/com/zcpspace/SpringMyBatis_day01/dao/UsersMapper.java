package com.zcpspace.SpringMyBatis_day01.dao;

import com.zcpspace.SpringMyBatis_day01.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {

    //查找所有用户信息
    List<Users> findAll();

}
