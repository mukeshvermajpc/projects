package com.test;
public class Employee {
  private int id=0;
public Employee(int id) {
	super();
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public boolean equals(Object arg) {
    Employee emp=(Employee)arg;
    return emp.id==id;
}

@Override
public int hashCode() {
	int result=31;
	result=result+id;
	Integer ab=new Integer(result);
	return ab.hashCode();
}

@Override
public String toString() {
	return "id=" + id;
}
  
}
