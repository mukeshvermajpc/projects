package com.pattern.two;

import java.util.Scanner;

public class PatternFive {
  public static void main(String args[])
  {
	  System.out.println("program for print pattern");
	  System.out.println("Enter the number you want to print");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int i=n;i>0;i--)
	  {
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=n;k++)
		{
			System.out.print(k);
		}
		for(int l=n-1;l>=i;l--)
		{
			System.out.print(l);
		}
		System.out.println();
	  }
  }
}
