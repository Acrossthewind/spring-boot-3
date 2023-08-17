package com.atguigu.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/11 22:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String role;

}
