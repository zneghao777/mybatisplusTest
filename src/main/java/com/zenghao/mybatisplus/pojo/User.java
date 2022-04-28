package com.zenghao.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.zenghao.mybatisplus.enums.SexEnum;
import lombok.Data;

@Data
//设置实体类所对应的表名
//@TableName("t_user")
public class User {

    //将属性对应的字段指定为主键
    //@TableId注解的value属性用于指定主键的字段
    //@TableId注解的type属性设置主键生成策略
    @TableId(value = "uid" )
    private Long id;
    @TableField("user_name")  //指定属性的字段名
    private String name;
    private Integer age;
    private String email;

    private SexEnum  sex;

    @TableLogic //逻辑删除字段
    private Integer isDeleted;

    public User(){

    }
    public User(long l, String admin, int i, Object o) {
    }
}
