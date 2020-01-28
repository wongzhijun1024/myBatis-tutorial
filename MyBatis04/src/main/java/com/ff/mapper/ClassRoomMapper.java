package com.ff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ff.po.ClassRoom;

public interface ClassRoomMapper {
	/**
	 * ���ӽ���
	 * @param teacher
	 * @return  �Ƿ�ɹ�
	 */
	public int insertClassRoom(@Param("myName")String name,@Param("teacherId")int teacherId);
	
	/**
	 *  ���ؽ���
	 * @return
	 */
	public List<ClassRoom>  selectAllClass();
	
	/**
	 * ��ý���
	 * @return ���Ҷ���
	 */
	public List<ClassRoom>  selectAllClassAndStu();
}