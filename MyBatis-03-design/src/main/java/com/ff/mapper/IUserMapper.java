package com.ff.mapper;

import com.ff.been.User;
import com.ff.mybatis.annotations.Select;

import java.util.List;

/**
 *
 * 用户的持久层接口
 */
public interface IUserMapper {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
