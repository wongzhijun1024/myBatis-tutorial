package com.ff.mapper;

import java.util.List;

import com.ff.po.Teacher;

public interface TeacherMapper {
	//查询出所有的老师
	public List<Teacher> selectAllTeacher();
}
