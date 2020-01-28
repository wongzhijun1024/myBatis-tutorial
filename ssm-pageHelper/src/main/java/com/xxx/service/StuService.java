package com.xxx.service;

import java.util.List;

import com.xxx.jopo.Stu;

public interface StuService {
	public List<Stu> getAllStuByPage(int nowPage, int pageSize);
}
