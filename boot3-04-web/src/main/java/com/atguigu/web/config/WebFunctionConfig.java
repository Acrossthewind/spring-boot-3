package com.atguigu.web.config;

import com.atguigu.web.biz.UserBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.*;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/12 14:30
 */
@Configuration
public class WebFunctionConfig {
    /**
     * 函数式Web：
     *  1. 给容器中放一个Bean ：类型是RouterFunction<ServerResponse>
     *  2. 每个业务准备一个自己的Handler
     *
     * 核心四大对象
     *  1. RouterFunction： 定义路由信息。发送什么请求，谁来处理
     *  2. RequestPredicate：定义请求，请求谓语。请求方式（GET、POST）、请求参数
     *  3. ServerRequest：   封装请求完整数据
     *  4. ServerResponse：  封装响应完整数据
     *
     */

    @Bean
    public RouterFunction<ServerResponse> userRouter(UserBizHandler userBizHandler){

        return RouterFunctions.route() //开始定义路由信息
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL),userBizHandler::getUser)
                .GET("/users", userBizHandler::getUsers)
                .POST("/user",RequestPredicates.accept(MediaType.APPLICATION_JSON),userBizHandler::saveUser)
                .PUT("/users/{id}",RequestPredicates.accept(MediaType.APPLICATION_JSON),userBizHandler::updateUser)
                .build();
    }
}
