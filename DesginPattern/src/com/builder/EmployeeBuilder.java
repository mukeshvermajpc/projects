package com.builder;
public class EmployeeBuilder {
   private int id;
   private String name;
   private String dept;
   private int salary;
   public EmployeeBuilder(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }
   public EmployeeBuilder setDept(String dept)
   {
	   this.dept=dept;
	   return this;
   }
   public EmployeeBuilder setSalary(int salary)
   {
	   this.salary=salary;
	   return this;
   }
   public Employee build()
   {
	   Employee employee=new Employee(id,name,dept,salary);
	   return employee;
   }
}
