package com.ff.mybatis.mapper;

import java.util.List;

import com.ff.mybatis.been.User;

public interface IUserMapper {

    List<User> findAll();
}
