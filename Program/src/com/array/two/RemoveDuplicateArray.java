package com.array.two;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateArray {
	public static void removeDuplicate(int arr[]) {
       Map<Integer,Integer>map=new LinkedHashMap<>();
       for(int a:arr)
       {
    	   if(map.containsKey(a))map.put(a,map.get(a)+1);
    	   else
    		   map.put(a,1);
       }
       map.forEach((key,value)->{
    	   System.out.println(key);
       });
	}
	public static void main(String args[]) {
       System.out.println("program for remove duplicate elements from array");
       int arr[] = {10,20,20,30,30,40,50,50};
       removeDuplicate(arr);
	}
}
