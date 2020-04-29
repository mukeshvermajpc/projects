package com.pattern;
public class Pattern {
  public static void main(String args[])
  {
	  System.out.println("Program for print pattern");
	  int size=5;
	  for(int i=1;i<=size;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println(" ");
	  }
  }
}
