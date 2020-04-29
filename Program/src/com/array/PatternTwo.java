package com.array;

public class PatternTwo {
	public static void print(int n) {
		int st=1;
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<(st*2-2);k++)
			{
				System.out.print(" ");
			}
			for(int l=i;l>0;l--)
			{
				System.out.print("*");
			}
			st++;
			System.out.println();
		}
	}

	public static void main(String args[]) {
		System.out.println("program for print pattern using java");
        print(5);
	}
}
