package com.pattern;
public class PyramidProgram {
  public void pyramid(int num)
  {
	  for(int i=1;i<=num;i++)
	  {
		  for(int j=num;j>i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=(2*i-1);k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
  public static void main(String args[])
  {
	  int num=5;
	  PyramidProgram obj=new PyramidProgram();
	  obj.pyramid(num);
  }
}
