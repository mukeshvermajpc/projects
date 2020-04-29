package com.logic;
public class PrimeTest {
    public static boolean isPrime(int n)
    {
           boolean prime=true;
           for(int i=2;i<=n/2;i++)
           {
        	   if(n%i==0)
        	   {
        		   prime=false;
        		   break;
        	   }
           }
           return prime;
    }
    public static void main(String args[])
    {
    		 
    		 for(int i=2;i<=100;i++)
    		 {
    			 boolean status=isPrime(i);
    			 if(status)
    				 System.out.println(i);
    		 }
    	 }
    }

