package com.zenghao.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zenghao.mybatis.pojo.User;
import com.zenghao.mybatis.service.UserService;
import com.zenghao.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zenghao
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-04-09 11:43:33
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




