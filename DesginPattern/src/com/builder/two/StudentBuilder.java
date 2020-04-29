package com.builder.two;
public class StudentBuilder {
  private int id;
  private String name;
  private String course;
  private String dept;
  public StudentBuilder(int id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
  public StudentBuilder setCourse(String course)
  {
	  this.course=course;
	  return this;
  }
  public StudentBuilder setDept(String dept)
  {
	  this.dept=dept;
	  return this;
  }
  public Student build()
  {
	  Student student=new Student(id,name,course,dept);
	  return student;
  }
}
