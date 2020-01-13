package com.example.dream.serviceImpl;

import com.example.dream.bean.User;
import com.example.dream.mapper.UserMapper;
import com.example.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getInfoById(String id) {
        return userMapper.getInfoById(id);
    }

    @Override
    public User getInfoByIdAndPsd(String id, String password) {
        return userMapper.getInfoByIdAndPsd(id,password);
    }
}
