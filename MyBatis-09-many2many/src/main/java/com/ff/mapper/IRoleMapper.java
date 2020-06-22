package com.ff.mapper;

import java.util.List;

import com.ff.bean.Role;


public interface IRoleMapper {

    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
