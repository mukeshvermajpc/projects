package com.copy.two;
public class Student implements Cloneable {
	private int id;
	private String name;
	private Subject subject;

	public Student(int id, String name, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student=(Student)super.clone();
		student.setSubject((Subject)student.getSubject().clone());
		return student;
	}
	
}
