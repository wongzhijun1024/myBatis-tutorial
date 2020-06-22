package com.ff.test;

import com.ff.bean.User;
import com.ff.mapper.IUserMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
public class SecondLevelCatchTest {

    private InputStream in;
    private SqlSessionFactory factory;


    @Before
    public  void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);

    }

    @After
    public  void destroy()throws  Exception{

        in.close();
    }

    @Test
    public void testFindOne(){
        SqlSession session = factory.openSession();
        IUserMapper userDao = session.getMapper(IUserMapper.class);
        User user = userDao.findById(57);
        System.out.println(user);

        session.close();//释放一级缓存

        SqlSession session1 = factory.openSession();//再次打开session
        IUserMapper userDao1 = session1.getMapper(IUserMapper.class);
        User user1 = userDao1.findById(57);
        System.out.println(user1);


        session1.close();

    }
}
