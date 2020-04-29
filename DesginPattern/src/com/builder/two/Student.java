package com.builder.two;

public class Student {
	private int id;
	private String name;
	private String course;
	private String dept;

	public Student(int id, String name, String course, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", course=" + course + ", dept=" + dept;
	}

}
