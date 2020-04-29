package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student {
	private int id;
	private String name;
	private String standard;
	private String stream;

	public Student(int id, String name, String standard, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.stream = stream;
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

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	public static void main(String args[])
	{
		List<Student>list=Arrays.asList(new Student(1,"Rahul","12th","Science"),
													new Student(2,"Manish","11th","Math"),
													new Student(3,"Rupal","12th","Commerce"),
													new Student(4,"Shashank","10th","Commerce"),
													new Student(5,"Shabez","9th","Biology"),
													new Student(6,"Sushil Kumar","10th","Computer"),
													new Student(8,"Manish","12th","Commerce"),
													new Student(9,"Devendra Kumar Yadav","10th","Math"),
													new Student(10,"Shivam","8th","Science"),
													new Student(11,"Sandip","12th","Math"));
		
		System.out.println("Group by in java 8");
		Map<String,List<Student>>mp=list.stream().collect(Collectors.groupingBy(obj->obj.getStandard()));
		mp.forEach((key,value)->{
			System.out.println(key);
			value.forEach((lst)->{
				System.out.println(lst.getId()+" "+lst.getName()+" "+lst.getStandard()+""+lst.getStream());
			});
		});
		
		System.out.println("program for count list of student by group");
		Map<String,Long>objectCt=list.stream().collect(Collectors.groupingBy(obj->obj.getStream(),Collectors.counting()));		
		objectCt.forEach((key,value)->{
			System.out.println(key+"---->"+value);
		});
		System.out.println("Program for count object by using class");
		Map<String,Long>standardCount=list.stream().collect(Collectors.groupingBy(obj->obj.getStandard(),Collectors.counting()));
	    standardCount.forEach((key,value)->{
	    	System.out.println(key+"----> "+value);
	    });
	    
	    Map<Student,Long>mlst=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    mlst.forEach((key,value)->{
	    	System.out.println(key.getId()+" "+key.getName());
	    	System.out.println(value);
	    });
	    System.out.println("program for converting list to set");
	    Set<Student>set=list.stream().collect(Collectors.toSet());
	    set.forEach((obj)->{
	    	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getStandard()+" "+obj.getStream());
	    });
	    System.out.println("program for convert list to map");
	    Map<Integer,Student>mstudent=list.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
	    mstudent.forEach((key,value)->{
	    	System.out.println(key+" "+value.getName());
	    });
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
