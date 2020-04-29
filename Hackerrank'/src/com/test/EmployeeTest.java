package com.test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
  public static void main(String args[])
  {
	Set<Employee>set=new HashSet<>();
	set.add(new Employee(10));
	set.add(new Employee(10));
	set.add(new Employee(20));
	set.add(new Employee(20));
	System.out.println(set);
  }
}
