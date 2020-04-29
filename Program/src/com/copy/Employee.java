package com.copy;

public class Employee implements Cloneable {
	private int id;
	private String name;
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee=(Employee)super.clone();
        employee.setAddress((Address)employee.getAddress().clone());
		return employee;
	}

}
