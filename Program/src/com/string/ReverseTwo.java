package com.string;
public class ReverseTwo {
	String reverse(String str)
	{
		if(str.length()==0)
		return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
	}
   String revString(String str)
   {
	   String st="";
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   st=st+str.charAt(i);
	   }
	   return st;
   }
  public static void main(String args[])
  {
	  System.out.println("program for reverse a string using recursion");
      String str="Happy New Year";
      ReverseTwo obj=new ReverseTwo();
      System.out.println(obj.reverse(str));
      System.out.println(obj.revString("hello"));
  }
}
