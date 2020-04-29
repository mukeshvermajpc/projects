package com.collection;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {
   public static void main(String args[])
   {
	  Employee emp=new Employee(1,"Rahul",250000);
	  Employee emp2=new Employee(2,"Manish",30000);
	  Employee emp3=new Employee(3,"Sumit",26000);
	  TreeSet<Employee>tree=new TreeSet<Employee>();
	  tree.add(emp);
	  tree.add(emp2);
	  tree.add(emp3);
	  tree.forEach((x)->{
		  System.out.println(x.getId()+" "+x.getName()+" "+x.getSalary());
	  });
   }
}
