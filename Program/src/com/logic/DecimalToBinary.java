package com.logic;
public class DecimalToBinary {
   public static int decimalToBinary(int num)
   {
	   int sum=0;
	   int n=1;
	   while(num>0)
	   {
		   int rem=num%2;
		   sum=sum+rem*n;
		   n=n*10;
		   num=num/2;
	   }
	   return sum;
   }
   public static void main(String args[])
   {
	   System.out.println("program for convert decimal number into binary");
	   int num=decimalToBinary(22);
	   System.out.println(num);
   }
}
