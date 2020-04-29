package com.pattern;
public class Pattern2 {
   public static void main(String args[])
   {
	   Pattern2 obj=new Pattern2();
	   obj.printPattern(5);
   }
   void printPattern(int n)
   {
	   for(int i=1;i<=n;i++)
	   {
		   int k=i;
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(k++ +" ");
		   }
		   System.out.println();
	   }
   }
}
