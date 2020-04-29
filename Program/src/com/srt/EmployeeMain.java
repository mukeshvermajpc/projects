package com.srt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
   public static void main(String args[])
   {
	   List<Employee>list=new ArrayList<>(Arrays.asList(new Employee(12,"Rahul","Senior Engineer"),
			                                            new Employee(15,"Manish","Software Engineer"),
			                                            new Employee(9,"Sumit Dubey","Project Engineer"),
			                                            new Employee(90,"Raushan Kumar","Product Engineer")));
	   System.out.println(list);
      Collections.sort(list, new SortById());
      
      list.forEach((obj)->{
    	  System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getDesig());
      });
   }
}
