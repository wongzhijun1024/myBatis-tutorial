package com.ff.mapper;

import java.util.List;

import com.ff.bean.QueryVo;
import com.ff.bean.User;

/**
 * 用户的持久层接口
 */
public interface IUserMapper {
	
	/**
	 * 根据用户信息，查询用户列表 
	 * @param user 
	 * @return
	 */
	List<User> findByUser(User user); 
	
	/**
	 * 根据用户信息，查询用户列表 
	 * @param user 
	 * @return
	 */
	List<User> findByUser2(User user); 
	

    /**
     * 根据queryvo中提供的id集合，查询用户信息
     * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);

	 /**
    * 查询所有用户
    * @return
    */
   List<User> findAll();
}
