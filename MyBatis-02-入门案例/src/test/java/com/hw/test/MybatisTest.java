package com.hw.test;

import com.ff.mybatis.been.User;
import com.ff.mybatis.mapper.IUserMapper;
import com.ff.mybatis.util.DBUtil;

import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class MybatisTest {

	public void findAll() {

		SqlSession session = DBUtil.getSqlSessionFactory().openSession();

		try {
			// 3、获取接口的实现类对象
			// 会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
			IUserMapper mapper = session.getMapper(IUserMapper.class);

			List<User> users = mapper.findAll();
			for (User user : users) {
				System.out.println(user);
			}
		} finally {
			session.close();
		}

	}

	public static void main(String[] args) {
		MybatisTest test = new MybatisTest();
		test.findAll();
	}
}
