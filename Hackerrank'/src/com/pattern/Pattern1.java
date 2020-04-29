package com.pattern;
public class Pattern1 {
  public static void main(String[] args) {
	System.out.println("program for print pattern in java");
	int count=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(count++ +" ");
		}
		System.out.println();
	}
}
}
