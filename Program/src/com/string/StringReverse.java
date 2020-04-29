package com.string;

public class StringReverse {
	public static void main(String args[]) {
	String str="raushan";
	String st=reverse(str);
	System.out.println("reversed string is: "+st);
	}
	public static String reverse(String str)
	{
		if(str.length()==0)
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
		
	}
}
