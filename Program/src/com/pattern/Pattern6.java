package com.pattern;
public class Pattern6 {
	static int a=1;
	public static void main(String args[])
   {
		int n=7;
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(a++  +" ");
		   }
		   System.out.println();
	   }
   }
}
