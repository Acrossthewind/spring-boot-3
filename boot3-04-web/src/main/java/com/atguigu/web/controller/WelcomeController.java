package com.atguigu.web.controller;

import com.atguigu.web.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/11 21:01
 */

@Controller //适配服务端渲染 前后不分离技术
public class WelcomeController {

    /**
     * 利用模版引擎跳转到指定页面
     * @return
     */
    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name, Model model){


        String msg= "<span style='color:red'>"+name+"<span/>";
        //把需要给页面共享的数据 放到model中
        model.addAttribute("name", msg);

        model.addAttribute("imgUrl", "/1.png");

        model.addAttribute("style", "width:500px");

        model.addAttribute("show", "true");

        //模版的逻辑视图名
        return "welcome";
    }

    @GetMapping("/list")
    public String getList(Model model){

        List<Person> list = Arrays.asList(
                new Person(1l,"张三","zs1.com",15,"pm"),
                new Person(2l,"李四","ls1.com",15,"pm"),
                new Person(3l,"王五","",15,"pm")
        );
//        int i=1/0;
        model.addAttribute("list",list);
        return "list";
    }



}
