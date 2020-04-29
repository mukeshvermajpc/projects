package com.string.two;

import java.util.HashMap;

public class MaxandMinString {
  public static void main(String args[])
  {
	  System.out.println("Program for find out max and min string");
	  String str = "Mukesh Kumar Verma Senior Software Engineer Product Development at Harman Connected Services Pune"; 
	  String arr[]=str.split(" ");
	  String min=arr[0];
	  String max=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i].length()>max.length())
		  {
			  max=arr[i];
		  }
		  if(arr[i].length()<min.length())
		  {
			  min=arr[i];
		  }
	  }
	  System.out.println(max);
	  System.out.println(min);
	  
	  
  }
}
