package com.ff.mapper;

import java.util.List;

import com.ff.po.Student;

public interface StudentMapper {


	/**
	 * 获得学生对象
	 * @return
	 */
	public Student selectStudentById(Student student);
	
	
	
}
