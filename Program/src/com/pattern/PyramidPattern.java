package com.pattern;
public class PyramidPattern {
  public static void main(String args[])
  {
	  int size=5;
	  for(int i=1;i<=size;i++)
	  {
		  for(int j=size;j>i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=0;k<(i*2-1);k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
}
