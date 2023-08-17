package com.atguigu.boot3.ssm.Controller;

import com.atguigu.boot3.ssm.bean.User;
import com.atguigu.boot3.ssm.mapper.UserMapper;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/12 15:54
 */
@RestController
public class UserController {

    @Resource
    UserMapper userMapper;

    /**
     * 返回User的json数据
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User user =userMapper.getUserById(id);
        return user;
    }
}
