package com.zcpspace.SpringMyBatis_day01.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zcpspace.SpringMyBatis_day01.entity.Users;
import com.zcpspace.SpringMyBatis_day01.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersServiceImpl;

    @RequestMapping("/users/index")
    public ModelAndView index(){
        PageInfo<Users> pageInfo = usersServiceImpl.findAll(1);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userPage",pageInfo);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/users/page",method = RequestMethod.POST
                    ,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object page(Integer pageNum,HttpServletResponse response){
        System.out.println(pageNum+"---------------------------------------------------");
        response.setCharacterEncoding("UTF-8");
        PageInfo<Users> list = usersServiceImpl.findAll(pageNum);
        return list;
    }



}
