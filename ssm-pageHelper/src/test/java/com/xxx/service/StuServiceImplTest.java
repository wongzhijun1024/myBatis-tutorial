package com.xxx.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxx.jopo.Stu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class StuServiceImplTest {
	@Autowired
	private StuService stuService;
	 
	@Test
	public void getAllStuByPageTest() {
		List<Stu> list = this.stuService.getAllStuByPage(6, 5);
		for (Stu stu : list) {
			System.out.println(stu);
		}
	}
}
