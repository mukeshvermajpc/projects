package com.copy.two;

public class StudentCopy {
	public static void main(String args[]) throws CloneNotSupportedException {
     Subject subject=new Subject("Physics","Chemistry","Math");
     Student student=new Student(12,"Rahul",subject);
     Student student2=(Student)student.clone();
     student2.getSubject().setSub1("Histroy");
     System.out.println("Details for student 1");
     System.out.println(student.getSubject().getSub1());
     System.out.println("Details of subject 2");
     System.out.println(student2.getSubject().getSub1());
     System.out.println("-----------------------");
     System.out.println("changing value of subject 2");
     student2.getSubject().setSub2("Poltical Science");
     System.out.println("subject 2 of object 1 "+student.getSubject().getSub2());
     System.out.println("subject 2 of object 2 "+student2.getSubject().getSub2());
     
     
	}
}
