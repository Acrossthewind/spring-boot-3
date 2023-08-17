package com.atguigu.boot.config;


import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 14:03
 */
/*@Import()*/
@Configuration //这是一个配置类，配置类本身也是容器中的组件。
public class Application {

    /**
     * 组件默认是单实例的
     * @return
     */
    @Bean("userHaha") //替代以前的Bean标签 组件在容器中的名字默认是方法名，可以修改注解的名字
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setUsername("zs");
        return user;
    }



}
