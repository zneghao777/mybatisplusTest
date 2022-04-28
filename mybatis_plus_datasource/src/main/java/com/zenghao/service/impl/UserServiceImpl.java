package com.zenghao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zenghao.mapper.UserMapper;
import com.zenghao.pojo.User;
import com.zenghao.service.UserService;
import org.springframework.stereotype.Service;


@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
