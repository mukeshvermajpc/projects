package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
	private int id;
	private String name;
	private int salary;

	public EmployeeTest(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTest other = (EmployeeTest) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
    public int hashcode()
    {
    	int result=31;
    	result=result*id;
    	result=result+name!=null?name.hashCode():0;
    	result=result+salary;
    	return result;
    }
    public static void main(String args[])
    {
        EmployeeTest emp=new EmployeeTest(1,"Raushan",25000);
        EmployeeTest emp2=new EmployeeTest(1,"Raushan",25000);
        System.out.println(emp.equals(emp2));
        System.out.println(emp.hashcode());
        System.out.println(emp2.hashcode());
        //understand Comparator in java 8
        List<EmployeeTest>list=Arrays.asList(new EmployeeTest(13,"Manish",29000),new EmployeeTest(19,"Rupal",25000),
        								 new EmployeeTest(25,"Gyanesh Sharma",35000),
        								 new EmployeeTest(18,"Priyanka",34000));
        Comparator<EmployeeTest>cmp=Comparator.comparing(EmployeeTest::getName);
        Comparator<EmployeeTest>cmp2=Comparator.comparing(EmployeeTest::getId);
        Comparator<EmployeeTest>cmp3=Comparator.comparing(EmployeeTest::getSalary);
        Collections.sort(list, cmp);
        list.forEach((obj)->{
        	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
        });
        System.out.println("list sorted according employee id");
        Collections.sort(list, cmp2);
        list.forEach((obj)->{
        	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
        });
        System.out.println("---List Sort according to employee salary-----");
        list.forEach((obj)->{
        	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
        });
        
    }
}
