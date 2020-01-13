package com.example.dream.service;

import com.example.dream.bean.User;

public interface UserService {

    User getInfoById(String id);

    User getInfoByIdAndPsd(String id, String password);

}
