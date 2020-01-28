package com.ff.po;

public class Student {
	/**
	 * ����id
	 */
	private int id;

	/**
	 * ѧ��������
	 */
	private String name;

	/**
	 * ����id
	 */
	private int classroomId;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int classroomId) {
		super();
		this.id = id;
		this.name = name;
		this.classroomId = classroomId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classroomId=" + classroomId + "]";
	}

}