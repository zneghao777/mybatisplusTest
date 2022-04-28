package com.zenghao.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zenghao.mybatisplus.mapper.UserMapper;
import com.zenghao.mybatisplus.pojo.User;
import com.zenghao.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
