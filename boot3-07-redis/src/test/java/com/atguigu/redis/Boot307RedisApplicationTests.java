package com.atguigu.redis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.UUID;

@SpringBootTest
class Boot307RedisApplicationTests {

    @Autowired
    StringRedisTemplate redisTemplate;   //key value 都是字符串

    //常见数据类型： k:v value可以有很多类型
    //String 普通字符串   redisTemplate.opsForValue()
    //list   列表         redisTemplate.opsForList()
    //set    集合         redisTemplate.opsForSet()
    //zset   有序集合     redisTemplate.opsForZSet()
    //hash    map结构     redisTemplate.opsForHash()

    /**
     * String
     */
    @Test
    void contextLoads() {

        redisTemplate.opsForValue().set("haha", UUID.randomUUID().toString());

        String haha = redisTemplate.opsForValue().get("haha");
        System.out.println(haha);

    }

    /**
     * list
     */
    @Test
    void testList(){


        redisTemplate.opsForList().leftPush("listName","1");
        redisTemplate.opsForList().leftPush("listName","2");
        redisTemplate.opsForList().leftPush("listName","3");

        String pop = redisTemplate.opsForList().leftPop("listName");
        Assertions.assertEquals("3",pop);
    }

    /**
     * Set
     */
    @Test
    void testSet(){

        String setName="setTest";
        redisTemplate.opsForSet().add(setName,"1","2","3","3");

        Boolean aBoolean = redisTemplate.opsForSet().isMember(setName, "2");
        Assertions.assertTrue(aBoolean);

        Boolean aBoolean1 = redisTemplate.opsForSet().isMember(setName, "5");
        Assertions.assertFalse(aBoolean1);
    }


    /**
     * zset
     */
    @Test
    void testZSet() {

        String setName = "ZSetTest";
        redisTemplate.opsForZSet().add(setName, "周肆淋", 90.00);
        redisTemplate.opsForZSet().add(setName, "贺新玉", 99.00);
        redisTemplate.opsForZSet().add(setName, "张三", 9.00);

        ZSetOperations.TypedTuple<String> popMax = redisTemplate.opsForZSet().popMax(setName);
        String value = popMax.getValue();
        Double score = popMax.getScore();
        System.out.println(value+"----"+score);

    }

    /**
     * hash  map结构
     */
    @Test
    void testHash(){
        redisTemplate.opsForHash().put("amap","name","张三");
        redisTemplate.opsForHash().put("amap","age","18");


    }


}
