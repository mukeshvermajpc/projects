package com.logic;
public class FibboSeries {
  public static void main(String[] args) {
	System.out.println("program for understand fibbonaci series");
	int a=0;
	int b=1;
	System.out.print(a+" "+b);
	int num=10;
	for(int i=2;i<num;i++)
	{
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}
}
