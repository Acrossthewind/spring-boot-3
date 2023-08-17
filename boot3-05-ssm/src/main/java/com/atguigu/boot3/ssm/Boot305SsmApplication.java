package com.atguigu.boot3.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan 告诉Mybatis，扫描哪一个包
 * 使用配置告诉Mybatis，每个接口的xml文件都在哪里
 * Mybatis就会自动绑定
 */
@MapperScan(basePackages="com.atguigu.boot3.ssm.mapper")
@SpringBootApplication
public class Boot305SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot305SsmApplication.class, args);
    }

}
