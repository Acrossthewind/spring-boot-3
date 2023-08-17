package com.atguigu.boot.bean;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/10 14:01
 */

public class User {
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
