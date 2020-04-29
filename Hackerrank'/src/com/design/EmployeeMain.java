package com.design;
public class EmployeeMain {
   public static void main(String args[])
   {
	   Employee emp=new EmployeeBuilder().setId(12).setName("Rahul").build();
	   System.out.println(emp);
	   Employee emp2=new EmployeeBuilder().setName("Raushan Kumar").setSalary(25000).build();
	   System.out.println(emp2);
	   Employee emp3=new EmployeeBuilder().setId(120).build();
	   System.out.println(emp3);
	   Employee emp4=new EmployeeBuilder().setSalary(29000).setId(130).build();
	   System.out.println(emp4);
   }
}
