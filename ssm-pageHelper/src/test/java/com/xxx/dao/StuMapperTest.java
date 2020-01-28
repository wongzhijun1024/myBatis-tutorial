package com.xxx.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxx.jopo.Stu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StuMapperTest {
	@Autowired
	private StuMapper stuMapper;
	@Test
	public void selectAllTest() {
		PageHelper.startPage(7, 5);
		List<Stu> list = stuMapper.selectAll();
		PageInfo<Stu> pageInfo = new PageInfo<>(list);
		System.out.println(list.size());
		System.out.println(pageInfo.getPages());
	}
}
