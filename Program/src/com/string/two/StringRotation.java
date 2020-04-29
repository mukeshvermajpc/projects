package com.string.two;
public class StringRotation {
  public static void main(String args[])
  {
	  System.out.println("program for check string rotation");
	  String str1="abcde";
	  String str2="deabc";
	  if(str1.length()!=str2.length())
	  {
		  System.out.println("Second string is not rotation of first string");
	  }
	  else {
		  str1=str1.concat(str2);
		  if(str1.indexOf(str2)!=-1)
		  {
			  System.out.println("second string is rotation of first string");
		  }
		  else {
			  System.out.println("second string is not rotation of first string");
		  }
	  }
  }
}
