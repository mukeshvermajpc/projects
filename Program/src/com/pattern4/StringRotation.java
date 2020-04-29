package com.pattern4;
public class StringRotation {
  public static void main(String args[])
  {
	  String str1="JavaJ2eeStrutsHibernate";
	  String str2="StrutsHibernateJava";
	  if(str1.length()!=str2.length())
		  System.out.println("String one is not rotation of string two");
	  else {
		  if(str1.indexOf(str2)==-1)
		  {
			  System.out.println("String 1 is rotation of string two");
		  }
		  else
		  {
			  System.out.println("String 1 is not rotation of string two");
		  }
	  }
	  
  }
}
