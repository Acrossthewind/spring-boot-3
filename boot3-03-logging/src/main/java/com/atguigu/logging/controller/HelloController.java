package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 21:04
 */
@Slf4j //添加日志注解后，会在类下注入一个log属性，用于日子信息的输出
@RestController
public class HelloController {

    //创建日子记录器
   /*Logger logger = LoggerFactory.getLogger(getClass());*/

    @GetMapping("/h")
    public String hello(String m1,String m2) {

        log.trace("trace 日志...");
        log.debug("debug 日志...");
        log.info("info 日志...m1:{} m2:{}",m1,m2); //默认日志级别是info
        log.warn("warn 日志...");
        log.error("error 日志...");


        return "Hello";
    }
}
