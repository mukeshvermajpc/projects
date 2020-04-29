package com.logic;
public class MSBExample {
	public static int msb(int num)
	{
		if(num==0)
			return 0;
		int mb=0;
		while(num!=0)
		{
			mb++;
			num=num/2;
		}
		System.out.println(mb-1);
		return (1<<mb-1);
	}
	public static void main(String args[]) {
       System.out.println("program for find out msb");
	    System.out.println(MSBExample.msb(15));
	}
}
