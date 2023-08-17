package com.atguigu.boot;

import com.atguigu.boot.bean.Pig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 11:54
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //java10: 局部变量类型自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);
        String[] names = ioc.getBeanDefinitionNames();
        //SpringBoot把以前配置的核心组件都给我们配置好了
        for (String name : names){
            System.out.println(name );
        }

        Pig pig = ioc.getBean(Pig.class);
        System.out.println(pig);
    }
}
