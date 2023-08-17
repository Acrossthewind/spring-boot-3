package com.atguigu.web.biz;

import com.atguigu.web.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.Arrays;
import java.util.List;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/12 14:51
 */
@Slf4j
@Service
public class UserBizHandler {

    //查询指定id的用户
    public ServerResponse getUser(ServerRequest request)throws Exception {
        //业务处理
        String id = request.pathVariable("id");
        log.info("查询"+id+"号数据");
        Person person = new Person(1L, "zsl", "1111", 12, "admin");
        //相应构造
        return ServerResponse
                .ok()
                .body(person);
    }

    //查询全部用户
    public ServerResponse getUsers(ServerRequest request)throws Exception{
        //业务处理
        List<Person> list=Arrays.asList(new Person(1L, "zsl", "1111", 12, "admin"),
                new Person(2L, "zsl", "1111", 12, "haha"),
                new Person(3L, "zsl", "1111", 12,"hehe")
       );
        //Person person = new Person(1L, "zsl", "1111", 12, "admin");

        //相应构造
        return ServerResponse
                .ok()
                .body(list); //凡是body中的对象，就是以前@RequestBody原理。写出为json
    }

    //保存用户
    public ServerResponse saveUser(ServerRequest request)throws Exception{
        //业务处理
        //提取请求体
        Person person = request.body(Person.class);
        log.info("保存用户信息完成");

        //相应构造
        return ServerResponse
                .ok()
                .build(); //凡是body中的对象，就是以前@RequestBody原理。写出为json
    }

    //更新用户信息
    public ServerResponse updateUser(ServerRequest serverRequest) {
        log.info("更新完成");
        return ServerResponse
                .ok()
                .build(); //凡是body中的对象，就是以前@RequestBody原理。写出为json
    }
}
