package com.pattern.two;

import java.util.Scanner;

public class PatternThree {
  public static void main(String args[])
  {
	  System.out.println("program for print pattern");
	  System.out.println("Enter the number of line you want to print");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int count=1;
	  for(int i=n;i>0;i--)
	  {
		  for(int j=1;j<i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=count;k++)
		  {
			  System.out.print(k+" ");
		  }
		  count++;
		  System.out.println();
	  }
  }
}
