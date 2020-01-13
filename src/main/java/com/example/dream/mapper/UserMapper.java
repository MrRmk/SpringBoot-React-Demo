package com.example.dream.mapper;

import com.example.dream.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getInfoById(String id);

    User getInfoByIdAndPsd(@Param("id")String id, @Param("password")String password);



}
