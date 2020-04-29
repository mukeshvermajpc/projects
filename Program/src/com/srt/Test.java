package com.srt;

import java.util.HashSet;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
	System.out.println("program for understand hashcode and equal method");
	Employee emp=new Employee(12,"Manish","Software Engineer");
	Employee emp2=new Employee(12,"Manish","Software Engineer");
	System.out.println(emp.equals(emp2));
	Set<Employee>set=new HashSet<>();
	set.add(emp);
	set.add(emp2);
	System.out.println(set);
	for(Employee em:set)
	{
    System.out.println(em.getId()+" "+em.getName()+" "+em.getDesig());
	}
	
}
}
