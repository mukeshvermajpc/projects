package com.pattern.three;

import java.util.Scanner;

public class PatternOne {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line you want to print");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	/*	System.out.println("Another pattern program");
		for (int i = n; i > 0; i--) {
			for (int j =1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k=n; k>=i; k--) {
				System.out.print(k);
			}
			for(int l=n;l>i;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}*/
		System.out.println("reverse star printing");
		for(int i=n;i>0;i--)
		{
		   for(int j=n;j>=i;j--)
		   {
			   System.out.print(" "); 
		   }
		   for(int k=1;k<=(2*i-1);k++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		}
	}
}
