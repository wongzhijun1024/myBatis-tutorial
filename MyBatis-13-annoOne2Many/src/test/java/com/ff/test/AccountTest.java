package com.ff.test;

import com.ff.bean.Account;
import com.ff.mapper.IAccountMapper;
import com.ff.mybatis.util.DBUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;


public class AccountTest {
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		test.testFindAll();
	}


    
    public  void  testFindAll(){	
    	SqlSession session = DBUtil.getSqlSessionFactory().openSession();
    	IAccountMapper mapper = session.getMapper(IAccountMapper.class);
        List<Account> accounts = mapper.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }
    }



}
