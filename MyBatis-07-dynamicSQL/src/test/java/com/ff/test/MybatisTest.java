package com.ff.test;

import com.ff.bean.QueryVo;
import com.ff.bean.User;
import com.ff.mapper.IUserMapper;
import com.ff.mybatis.util.DBUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 测试mybatis的crud操作
 */
public class MybatisTest {

	public static void main(String[] args) {
		MybatisTest mybatisTest = new MybatisTest();

		mybatisTest.findUserInIds();
	}

	public void findByUser() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);

		User user = new User();
		user.setUserName("%3%");
		List<User> users = mapper.findByUser(user);

		for (User u : users) {
			System.out.println(u);
		}
	}

	public void findByUser2() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);

		User user = new User();
		user.setUserName("%3%");
		List<User> users = mapper.findByUser2(user);

		for (User u : users) {
			System.out.println(u);
		}
	}

	public void findUserInIds() {
		QueryVo vo = new QueryVo();
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(41);
		ids.add(42);
		ids.add(43);
		ids.add(46);
		ids.add(57);
		vo.setIds(ids);

		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		List<User> users = mapper.findUserInIds(vo);

		for (User user : users) {
			System.out.println(user);
		}
	}

	public void testFindAll() {

		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		// 5.执行查询所有方法
		List<User> users = mapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}

	}



	/**
	 * 测试foreach标签的使用
	 */

	public void testFindInIds() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		QueryVo vo = new QueryVo();
		List<Integer> list = new ArrayList<Integer>();
		list.add(41);
		list.add(42);
		list.add(46);
		vo.setIds(list);

		// 5.执行查询所有方法
		List<User> users = mapper.findUserInIds(vo);
		for (User user : users) {
			System.out.println(user);
		}

	}
}
