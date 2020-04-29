package com.builder.two;
public class StudentMain {
   public static void main(String args[])
   {
	   System.out.println("program for understand builder design pattern");
	   Student student=new StudentBuilder(12,"Raushan Kumar").setCourse("BTech").setDept("IT").build();
	   System.out.println(student);
	   Student student2=new StudentBuilder(23, "Manish Kumar").setCourse("BTech").setDept("EEE").build();
	   System.out.println("students detail");
	   System.out.println(student2);
   }
}
