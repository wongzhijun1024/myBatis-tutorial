package com.ff.mapper;

import java.util.List;

import com.ff.bean.User;

/**
 * 用户的持久层接口
 */
public interface IUserMapper {

    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);


}
