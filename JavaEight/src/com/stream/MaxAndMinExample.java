package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinExample {
    public static void main(String args[])
    {
    	List<Employee>list=Arrays.asList(new Employee(1,"Raushan",25),new Employee(2,"Shabez",24),new Employee(13,"Sudhanshu",21));
    	Comparator<Employee>cmp=Comparator.comparing(Employee::getAge);
    	Employee obj=list.stream().min(cmp).get();
    	System.out.println(obj.getId());
    	System.out.println(obj.getName());
    	System.out.println(obj.getAge());
    	System.out.println("Maximum age of the employee");
    	Employee employee=list.stream().max(cmp).get();
    	System.out.println(employee.getId());
    	System.out.println(employee.getName());
    	System.out.println(employee.getAge());
    	
    }
}