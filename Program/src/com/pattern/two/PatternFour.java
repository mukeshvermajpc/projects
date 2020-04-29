package com.pattern.two;

import java.util.Scanner;

public class PatternFour {
	public static void main(String args[]) {
     System.out.println("program for print pattern");
     System.out.println("Enter the number of line you want");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=n;i>0;i--)
     {
    	 for(int j=n;j>i;j--)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<=i;k++)
    	 {
    		 System.out.print(k);
    	 }
    	 for(int l=i-1;l>0;l--)
    	 {
    		 System.out.print(l);
    	 }
    	  System.out.println();
     }
	}
}
