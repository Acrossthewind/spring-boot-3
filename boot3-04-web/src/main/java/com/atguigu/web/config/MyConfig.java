package com.atguigu.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/11 14:28
 */
@Configuration //这是一个配置类
public class MyConfig implements WebMvcConfigurer {

  /*  @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //保留以前的配置
        WebMvcConfigurer.super.addResourceHandlers(registry);

        //自己写
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/a/", "classpath:/b/")
                .setCacheControl(CacheControl.maxAge(72000, TimeUnit.SECONDS));
    }
    */

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer(){
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/a/", "classpath:/b/")
                        .setCacheControl(CacheControl.maxAge(72000, TimeUnit.SECONDS));

            }
        };
    }
}
