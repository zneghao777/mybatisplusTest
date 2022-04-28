package com.zenghao.mybatisplus;

import com.zenghao.mybatisplus.enums.SexEnum;
import com.zenghao.mybatisplus.mapper.UserMapper;
import com.zenghao.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnumsTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = new User();
        user.setName("何婷");
        user.setAge(19);
        user.setSex(SexEnum.FEMALE);
        int insert = userMapper.insert(user);
        System.out.println(insert);

    }
}
