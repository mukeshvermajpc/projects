package com.builder;

public class EmployeeMain {
	public static void main(String args[]) {
      Employee employee=new EmployeeBuilder(12, "raushan").setDept("IT").setSalary(39000).build();
      System.out.println(employee);
      Employee emp=new EmployeeBuilder(13,"Manish Kumar").setSalary(45000).build();
      System.out.println(emp);
      Employee emp2=new EmployeeBuilder(22594,"Mukesh Kumar").setDept("HR").build();
      System.out.println(emp2);
	}
}
