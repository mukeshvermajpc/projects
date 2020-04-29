package com.test;
public class LeastSingificantDigit {
     public static boolean LSB(int num)
     {
    	 boolean x=(num&(1<<3))!=0;
        return x;
     }
	public static void main(String[] args) {
       int num=20;
       System.out.println(num &(1<<3));
       System.out.println(5&5);
       System.out.println(num);
       System.out.println(16&(1<<3));
       int a=50;
       int b=20;
       System.out.println(a&b);       
       if(LeastSingificantDigit.LSB(num))
       {
    	   System.out.println("1");
       }
       else
       {
    	   System.out.println("0");
       }
       System.out.println("Understanding >>>");
       System.out.println(10>>2);
	   System.out.println(10<<2);
	   System.out.println(~10);
	}
}
