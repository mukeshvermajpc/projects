package com.logic;
public class PalindromeString {
   public static boolean isPalindrome(String str)
   {
	   int n=str.length();
	   boolean st=false;
	   for(int i=0;i<n/2;i++)
	   {
		   if(str.charAt(i)==str.charAt(n-1-i))
			   st=true;
		   else
			   st=false;
	   }
	   return st;
   }
   public static void main(String args[])
   {
	   System.out.println("program for understand palindrome in java");
       String str="ram";
	   if(PalindromeString.isPalindrome(str))
		    System.out.println("String is palindrome ");
	   
   }
}
