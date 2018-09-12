package com.zcpspace.SpringMyBatis_day01.service;

import com.github.pagehelper.PageInfo;
import com.zcpspace.SpringMyBatis_day01.entity.Users;



public interface UsersService {

    PageInfo<Users> findAll(Integer pageNum);

}
