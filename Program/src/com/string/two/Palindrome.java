package com.string.two;

public class Palindrome {
  public static void main(String[] args) {
	System.out.println("program for check string is palindrome or not");
	String str="mukesh";
	boolean flag=false;
	for(int i=0;i<=str.length()/2;i++)
	{
		if(str.charAt(i)!=str.charAt(str.length()-1-i))
		{
			flag=true;
			break;
		}
	}
	if(flag)
		System.out.println("String is not palindrome");
	else
		System.out.println("String is palindrome");
		
}
}
