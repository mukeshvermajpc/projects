package com.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {
	public void getMaleFemaleCount(List<Employee> list) {
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}

	public void getDepartment(List<Employee> list) {
	List<String>lst=	list.stream().map((obj) -> obj.getDepartment()).distinct().collect(Collectors.toList());
	lst.forEach(x->System.out.println(x));
	}

	public void getAverageSalary(List<Employee> list) {
		Map<String, Double> mp = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		mp.forEach((key, value) -> {
			System.out.println(key + "--->" + value);
		});
	}

	public void getMaxSalary(List<Employee> list) {
		Comparator<Employee> cmp = Comparator.comparing(Employee::getSalary);
		Employee employee = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDepartment() + " "
				+ employee.getGender() + " " + employee.getSalary() + " " + employee.getYearOfJoing() + " "
				+ employee.getAge());
	}

	public void getMinimumSalary(List<Employee> list) {
		Comparator<Employee> cmp = Comparator.comparing(Employee::getSalary);
		Employee employee = list.stream().min(cmp).get();
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDepartment() + " "
				+ employee.getGender() + " " + employee.getSalary() + " " + employee.getYearOfJoing() + " "
				+ employee.getAge());
	}

	public void getAverageAgeMaleAndFemale(List<Employee> list) {
		Map<String, Double> avg = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(obj -> obj.getAge())));
		avg.forEach((key, value) -> {
			System.out.println(key + "-> " + value);
		});
	}

	public void joinAfter(List<Employee> list) {
		List<String> lst = list.stream().filter(e -> e.getYearOfJoing() > 2015).map(obj -> obj.getName())
				.collect(Collectors.toList());
		lst.forEach(x -> System.out.println(x));
	}

	public void getEmployeeDepartment(List<Employee> list) {
		Map<String, Long> empCount = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		empCount.forEach((key, value) -> {
			System.out.println(key + "->" + value);
		});
	}

	public void getAverageDepartmentSalary(List<Employee> list) {
		Map<String, Double> avg = list.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		avg.forEach((key, value) -> {
			System.out.println(key + " ->" + value);
		});
	}

	public void getYougestEmployee(List<Employee> list) {
		Comparator<Employee> cmp = Comparator.comparing(Employee::getAge);
		Optional<Employee> employee = list.stream()
				.filter((emp) -> emp.getGender() == "Male" && emp.getDepartment() == "Product Development").min(cmp);
		Employee emp2 = employee.get();
		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getDepartment() + " " + emp2.getSalary()
				+ " " + emp2.getYearOfJoing() + " " + emp2.getAge());
	}

	public void getMostExperience(List<Employee> list) {
		Optional<Employee> emp = list.stream().sorted(Comparator.comparing(Employee::getYearOfJoing)).findFirst();
		Employee employee = emp.get();
		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDepartment() + " "
				+ employee.getGender() + " " + employee.getSalary() + " " + employee.getYearOfJoing());
	}

	public void getSalesAndMarketingEmployee(List<Employee> list) {
		Map<String, Long> mp = list.stream().filter(emp -> emp.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		mp.forEach((key, value) -> {
			System.out.println(key + " -> " + value);
		});
	}

	public void getAverageSalaryMaleFemale(List<Employee> list) {
		Map<String, Double> mp = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		mp.forEach((key, value) -> {
			System.out.println(key + "-> " + value);
		});
	}

	public void getDepartmentEmployee(List<Employee> list) {
		Map<String, List<Employee>> mp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		mp.forEach((key, value) -> {
			System.out.println("---------------------------------");
			System.out.println(key);
			System.out.println("---------------------------------");
			value.forEach((emp) -> {
				System.out.println(emp.getName());
			});
		});
	}

	public void getAverageTotalSalary(List<Employee> list) {
		DoubleSummaryStatistics employeeSalaryStatistics = list.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary is: " + employeeSalaryStatistics.getAverage());
		System.out.println("Max salary: " + employeeSalaryStatistics.getMax());
		System.out.println("Min Salary: " + employeeSalaryStatistics.getMin());
		System.out.println("Total salary: " + employeeSalaryStatistics.getCount());
	}

	public void partition(List<Employee> list) {
		Map<Boolean, List<Employee>> partitionByAge = list.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
		partitionByAge.forEach((key, value) -> {
			if (key) {
				System.out.println("---------------------------------");
				System.out.println("List of employee age less than 25");
				System.out.println("----------------------------------");
			} else {
				System.out.println("------------------------------------");
				System.out.println("List of employee age greater than 25");
				System.out.println("-------------------------------------");
			}
			value.forEach(obj -> {
				System.out.println(obj.getName());
			});
		});
	}
}
