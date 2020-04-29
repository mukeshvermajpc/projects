package com.logic;
public class StringReverse {
	static String st="";
   public static String reverse(String str)
   {
	   if(str.length()==0)
	     return str;
	   else
         return reverse(str.substring(1))+str.charAt(0);
   }
   public static void main(String args[])
   {
	   System.out.println("Reverse string using recursion");
	   String str="I Love My India";
	   for(String st:str.split(" "))
	   {
		   System.out.println(StringReverse.reverse(st));
	   }
   
   }
}
