package com.zcpspace.SpringMyBatis_day01.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zcpspace.SpringMyBatis_day01.dao.UsersMapper;
import com.zcpspace.SpringMyBatis_day01.entity.Users;
import com.zcpspace.SpringMyBatis_day01.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersServiceImpl")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageInfo<Users> findAll(Integer pageNum) {
        Page<Users> page = PageHelper.startPage(pageNum, 5);
        usersMapper.findAll();
        return page.toPageInfo();
    }
}
