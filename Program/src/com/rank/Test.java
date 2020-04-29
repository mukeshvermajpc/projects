package com.rank;
public class Test {
  public static void main(String args[])
  {
	  String str="{[()]}";
	  char arr[]=str.toCharArray();
	  int n=arr.length;
	   boolean status=false;
	  for(int i=0;i<=n/2;i++)
	  {
		  System.out.println(arr[i]);
		  System.out.println(arr[n-1-i]);
	  }
	  if(status)
	  {
		  System.out.println("YES");
	  }
	  else {
		  System.out.println("NO");
	  }
	  
  }
}