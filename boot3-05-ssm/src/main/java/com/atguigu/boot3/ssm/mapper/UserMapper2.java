package com.atguigu.boot3.ssm.mapper;


import com.atguigu.boot3.ssm.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper2 {

    public User getUserById(@Param("id") long id);

}
