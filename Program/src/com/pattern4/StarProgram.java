package com.pattern4;
public class StarProgram {
  public static void display(int n)
  {
	  for(int i=n;i>=1;i--)
	  {
		  int count=i;
		  for(int j=1;j<=n;j++)
		  {
			  if(j<=i)
				  System.out.print(j);
			  else
				  System.out.print("*");
		  }
		  for(int k=n;k>=1;k--)
		  {
			  if(k<=i)
				  System.out.print(count--);
			  else 
				  System.out.print("*");
		  }
		 
		  System.out.println();
	  }
  }
  public static void main(String args[])
  {
	  System.out.println("program for print star");
	  display(4);
  
  }
}
