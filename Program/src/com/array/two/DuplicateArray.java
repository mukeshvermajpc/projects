package com.array.two;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
   public static void main(String args[])
   {
	   System.out.println("program for print duplicate element of array");
	   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
	   Map<Integer,Integer>map=new HashMap<>();
	   for(int a:arr)
	   {
		   if(map.containsKey(a))
		   {map.put(a,map.get(a)+1);}
		   else
		   {map.put(a, 1);}
	   }
	   map.forEach((key,value)->{
		   if(value>1)System.out.println(key);
	   });
	   
   }
}
