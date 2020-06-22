package com.ff.test;

import com.ff.bean.Role;
import com.ff.mapper.IRoleMapper;
import com.ff.mybatis.util.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;


public class RoleTest {
	
	
	public static void main(String[] args) {
		RoleTest test = new RoleTest();
		test.findAll();
	}


    /**
     * 测试查询所有
     */
    @Test
    public void findAll(){
    	SqlSession session = DBUtil.getSqlSessionFactory().openSession();
    	IRoleMapper mapper = session.getMapper(IRoleMapper.class);
        List<Role> roles = mapper.findAll();
        for(Role role : roles){
            System.out.println("---每个角色的信息----");
            System.out.println(role);
            System.out.println(role.getUsers());
        }
    }



}
