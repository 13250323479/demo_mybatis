package com.demo.mybatis.controller;

import com.demo.mybatis.entity.User;
import com.demo.mybatis.mapper.UserMapper;
import com.demo.mybatis.utils.Maputils;
import com.demo.mybatis.utils.ParamPojo;
import com.demo.mybatis.utils.ResultMap;
import com.demo.mybatis.utils.SnowflakeIdWorker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/index")
public class TestBoosController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public User getUser(@RequestBody ParamPojo paramPojo) throws Exception{
        Map<String, Object> data = paramPojo.getData();

        Object id = data.get("id");
        User user = userMapper.selectUserById(Long.parseLong(id.toString()));
        return user;
    }

    @PutMapping("/user")
    public ResultMap insertUser(@RequestBody ParamPojo paramPojo) throws Exception{
        Map<String, Object> data = paramPojo.getData();

        String name = Maputils.getString(data,"name");
        Integer age = Maputils.getInt(data,"age");
        if(age == null){
            age = 0;
        }
        User user = new User();
        user.setId(SnowflakeIdWorker.nextId());
        user.setAge(age);
        user.setName(name);

        int i = userMapper.insertUser(user);
        System.out.println(i);

        return new ResultMap();
    }

}