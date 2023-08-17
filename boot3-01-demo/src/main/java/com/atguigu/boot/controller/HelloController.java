package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 10:01
 */
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello SpringBoot3!";
    }
}
