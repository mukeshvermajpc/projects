package com.logic;
public class Prime {
   public static boolean isPrime(int num)
   {
	   boolean status=false;
	   for(int i=2;i<=num/2;i++)
	   {
		   if(num%i==0)
		   {
			   status=true;
		   }
	   }
	   return status;
   }
   public static void main(String args[])
   {
	   int count=0;
	for(int i=2;i<=100;i++)
	{
		if(!Prime.isPrime(i))
		{
			System.out.print(i+" ");
		    count++;
		}
	}
	System.out.println("\nTotal prime number from 2 to 100 is: "+count);
   }
}
