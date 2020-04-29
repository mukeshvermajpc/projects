package com.logic;
public class PalindromeNumber {
   public static void isPalindrome(int num)
   {
	   int sq=1;
	   int sum=0;
	   int n=num;
	   while(num>0)
	   {
		   int rem=num%10;
		   sum=sum+rem*rem*rem;
		   num=num/10;
	   }
	   System.out.println("Sum of number is: "+sum);
	  if(sum==n)
		  System.out.println("Number is Armstrong");
	  else
		  System.out.println("Number is not Armstrong");
   }
   public static void main(String args[])
   {
	   isPalindrome(153);
   }
}
