package com.pattern.two;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[]) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of line you want to print");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print(count+" ");
			}
			System.out.println();
			count++;
		}

	}
}
