package com.atguigu.features.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 14:50
 */
@Profile("pri")
@Component
@Data
public class Pig {
    private Long id;

    private String name;

    private Integer age;

}
