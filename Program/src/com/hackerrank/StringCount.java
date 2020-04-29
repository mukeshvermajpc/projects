package com.hackerrank;
public class StringCount {
  public static int count(String str)
   {
	  int count=0;
	  for(int i=0;i<str.length()-1;i++)
	  {
		  if(str.charAt(i)==(str.charAt(i+1)))
		  {
			  count++;
		  }
	  }
	  return count;
   }
  public static void main(String args[])
  {
	  System.out.println(count("ABABABAB"));
  }
}
