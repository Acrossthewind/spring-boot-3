package com.atguigu.boot3.ssm.bean;

import lombok.Data;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/12 15:36
 */

@Data
public class User {
    private Long id;
    private String loginName;
    private String nickName;
    private String passwd;

}
