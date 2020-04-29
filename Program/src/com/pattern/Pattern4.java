package com.pattern;
public class Pattern4 {
  public static void main(String args[])
  {
	  int size=5;
	  for(int i=size;i>=1;i--)
	  {
		  for(int j=size;j>i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=(i*2-1);k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  
  }
}
