package com.xxx.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.xxx.dao.StuMapper;
import com.xxx.jopo.Stu;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper stuMapper;
	 
	@Override
	public List<Stu> getAllStuByPage(int nowPage, int pageSize) {
		PageHelper.startPage(nowPage, pageSize);
		List<Stu> list = this.stuMapper.selectAll(); 
		return list;
	}
}
