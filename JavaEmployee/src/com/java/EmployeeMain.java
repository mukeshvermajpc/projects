package com.java;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class EmployeeMain {
   public static void main(String args[])
   {
	  List<Employee>list=Arrays.asList(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
			  		  new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
			  		  new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
					  new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
					  new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
					  new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
					  new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0),
					  new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0),
					  new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0),
					  new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5),
					  new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),
					  new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0),
					  new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0),
					  new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5),
					  new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0),
					  new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),
					  new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	 EmployeeService service=new EmployeeService();
	 service.getMaleFemaleCount(list);
	 System.out.println("Get all department");
	 service.getDepartment(list);
	 System.out.println("Average of male and female employees salary");
	 service.getAverageSalary(list);
	 System.out.println("Detail of max salary paid employee");
	 service.getMaxSalary(list);
	 System.out.println("Get minimum salary of the employee");
	 service.getMinimumSalary(list);
	 System.out.println("Average age of male and female employee");
	 service.getAverageAgeMaleAndFemale(list);
     System.out.println("List of employee who join after 2015");
     service.joinAfter(list);
     System.out.println("List of employee in each department");
     service.getEmployeeDepartment(list);
     System.out.println("Average salary of each department");
     service.getAverageDepartmentSalary(list);
     System.out.println("find out youngest male employee from production department");
     service.getYougestEmployee(list);
     System.out.println("Employee get most experienced employee");
     service.getMostExperience(list);
     System.out.println("Count Male and female employee in marketing and sales department");
     service.getSalesAndMarketingEmployee(list);
     System.out.println("Average salary of male and female employee");
     service.getAverageSalaryMaleFemale(list);
     System.out.println("List of employee in each department");
     service.getDepartmentEmployee(list);
     System.out.println("Average salary and total salary of the whole Organization");
     service.getAverageTotalSalary(list);
     System.out.println("Seprate the employee who are younger or equal to 25 year from those who are older than 25 years");
     service.partition(list);
   
   
   
   
   }
}
