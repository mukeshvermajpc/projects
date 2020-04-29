package com.pattern3;

public class Pattern3 {
	public static void main(String args[]) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=(2*i-1);j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
