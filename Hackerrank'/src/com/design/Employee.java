package com.design;
public class Employee {
   private int id;
   private String name;
   private int salary;
public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", salary=" + salary;
}

}
