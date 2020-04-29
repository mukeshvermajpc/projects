package com.prototype;
public class EmployeeMain {
  public static void main(String args[]) throws CloneNotSupportedException
  {
	  Address address=new Address("Pune",411057);
	  Employee employee=new Employee(12,"Raushan",35000,address);
	  Employee employee2=(Employee) employee.clone();
	  System.out.println("Details of employee 1");
	  System.out.println(employee.getId());
	  System.out.println(employee.getName());
	  System.out.println(employee.getSalary());
	  System.out.println(employee.getAddress().getCity());
	  System.out.println(employee.getAddress().getPincode());
	  System.out.println("Details of employee 2");
	  System.out.println(employee2.getId());
	  System.out.println(employee2.getName());
	  System.out.println(employee2.getSalary());
	  System.out.println(employee2.getAddress().getCity());
	  System.out.println(employee2.getAddress().getPincode());
	  System.out.println("Employee detail after changing values");
	  employee2.getAddress().setCity("Mumbai");
	  employee2.getAddress().setPincode(224122);
	  System.out.println("Employee one details is:");
	  System.out.println(employee.getAddress().getCity());
	  System.out.println(employee.getAddress().getPincode());
	  System.out.println("Employee 2 detail is:");
	  System.out.println(employee2.getAddress().getCity());
	  System.out.println(+employee2.getAddress().getPincode());
  }
}
