package com.array;
public class Pattern {
	public static void print(int n)
	{
		int sp=1;
		int sp2=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=(2*n-sp*2);k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
			sp++;
		}
		
	}
   public static void main(String args[])
   {
	   System.out.println("program for printing pattern in java");
       print(5);
   }
}
