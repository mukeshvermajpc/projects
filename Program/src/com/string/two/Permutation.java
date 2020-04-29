package com.string.two;
public class Permutation {
	public static void permutation(String str,String out)
	{
		if(str.length()==0)
		{
			System.out.print(out+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String res=str.substring(0,i)+str.substring(i+1);
			permutation(res,out+ch);
		}
	}
  public static void main(String args[])
  {
	  System.out.println("program for find out permutation");
	  permutation("abc", "");
  }
}
