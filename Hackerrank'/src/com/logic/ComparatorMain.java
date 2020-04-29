package com.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
	public static void main(String args[]) {
		List<Employee> list = Arrays.asList(new Employee(49, "Raushan", 35000), new Employee(13, "Manish", 40000),
				new Employee(14, "Sameer", 45000), new Employee(123, "Rahul", 49000));
		Comparator<Employee> cmp = Comparator.comparing(emp -> emp.getName());
		Collections.sort(list, cmp);
		list.forEach(emp -> {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
		});
		System.out.println("Sorting by id");
		Comparator<Employee> cp = Comparator.comparing(Employee::getId);
		Collections.sort(list, cp);
		list.forEach(emp -> {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
		});
		Comparator<Employee>cp2=Comparator.comparing(Employee::getSalary);
		Collections.sort(list,cp2);
		System.out.println("Sorting according to salary");
		list.forEach(obj->{
			System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
		});
	}
}
