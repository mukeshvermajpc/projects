package com.design;

public class EmployeeTwo implements Cloneable {
	private int id;
	private String name;
	private Address address;

	public EmployeeTwo(int id, String name, Address address) {
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
		EmployeeTwo emp = (EmployeeTwo) super.clone();
		emp.setAddress((Address) emp.address.clone());
		return emp;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}
	
}
