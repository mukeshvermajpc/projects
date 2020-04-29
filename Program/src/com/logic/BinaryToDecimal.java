package com.logic;
public class BinaryToDecimal {
	public static int binaryToDecimal(int num)
	{
		int n=1;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem*n;
			n*=2;
			num/=10;
		}
		return sum;
	}
   public static void main(String args[])
   {
	   System.out.println("program for understand binary to decimal conversion");
	   int n=binaryToDecimal(11110001);
	   System.out.println(n);
   }
}
