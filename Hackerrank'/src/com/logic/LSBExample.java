package com.logic;

public class LSBExample {
	public static boolean lsb(int num)
	{
	   boolean b=(num&(1<<(3)))!=0;
		
		return b;
	}
	public static void main(String args[]) {
        System.out.println("Program for find out lsb");
	     int num=26;
        if(LSBExample.lsb(num))
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}

}
