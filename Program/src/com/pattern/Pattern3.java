package com.pattern;
public class Pattern3 {
   public static void main(String args[])
   {
	Pattern3 pt=new Pattern3();
	pt.printPattern(6);
   }
   void printPattern(int n)
   {
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=n;j>=i;j--)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
