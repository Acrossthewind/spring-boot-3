package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 11:58
 */
@RestController
public class HelloController {
    @GetMapping("/haha")
    public String hello(){
        return "Hello";
    }
}
