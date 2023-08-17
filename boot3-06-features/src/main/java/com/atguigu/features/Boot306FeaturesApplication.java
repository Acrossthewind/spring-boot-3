package com.atguigu.features;

import com.atguigu.features.bean.Pig;
import com.atguigu.features.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot306FeaturesApplication {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot306FeaturesApplication.class, args);

        String[] names = ioc.getBeanDefinitionNames();
        //SpringBoot把以前配置的核心组件都给我们配置好了
        for (String name : names){
            System.out.println(name );
        }

        User bean = ioc.getBean(User.class);
        System.out.println(bean);

    }





}
