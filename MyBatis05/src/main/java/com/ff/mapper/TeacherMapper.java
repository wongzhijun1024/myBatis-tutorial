package com.ff.mapper;

import java.util.List;
import java.util.Map;

import com.ff.po.Teacher;

public interface TeacherMapper {
	/**
	 * ��ѯ������ʦ
	 * @return  ��ʦ�б�
	 */
	public List<Teacher> selectAllTeacher();
	/**
	 * ������ʦ
	 * @param teacher
	 * @return  �Ƿ�ɹ�
	 */
	public int insertTeacher(Map<String, Object> map);
}