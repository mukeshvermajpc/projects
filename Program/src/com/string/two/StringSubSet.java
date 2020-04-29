package com.string.two;
public class StringSubSet {
  public static void main(String[] args) {
	System.out.println("program for subset of string");
	String str="abc";
	for(int i=0;i<str.length();i++)
	{
		for(int j=i;j<str.length();j++)
		{
			System.out.println(str.substring(i, j+1));
		}
	}
}
}
