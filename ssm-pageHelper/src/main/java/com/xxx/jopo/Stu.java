package com.xxx.jopo;

import javax.swing.JOptionPane;

public class Stu {
	private int id;
	private String name;
	private String sex;
	private int age;
	public Stu() {
		
	}
	public Stu(int id, String name, String sex, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public static void main(String[] args) {
		Stu stu = new Stu(1, "Íõ¶þÂé×Ó", "ÄÐ", 30);
		String inf = stu.toJson();
		JOptionPane.showMessageDialog(null, inf);
	}
	public String toJson() {
		return "{\"id\":"+id+",\"name\":\""+name+"\",\"sex\":\""+sex+"\",\"age\":"+age+"}";
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
