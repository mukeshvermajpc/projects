package com.design;

public class EmployeeBuilder {
	private int id;
	private String name;
	private int salary;

	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public EmployeeBuilder setSalary(int salary) {
		this.salary = salary;
		return this;
	}

	public Employee build() {
		return new Employee(id, name, salary);
	}
}
