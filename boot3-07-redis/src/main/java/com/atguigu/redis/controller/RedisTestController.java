package com.atguigu.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/13 16:16
 */

@RestController
public class RedisTestController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/cont")
    public String getCount(){

        //常见数据类型： k:v value可以有很多类型
        //String 普通字符串   redisTemplate.opsForValue()
        //list   列表         redisTemplate.opsForList()
        //set    集合         redisTemplate.opsForSet()
        //zset   有序集合     redisTemplate.opsForZSet()
        //hash    map结构     redisTemplate.opsForHash()

        Long hello = redisTemplate.opsForValue().increment("hello");

        return "访问了"+hello+"次";
    }
}
