package com.pattern4;

public class PermutationString {
	public void permutate(String str,int l,int n)
	{
		if(l==n)
			System.out.println(str);
		else
		{
			for(int i=l;i<=n;i++)
			{
				str=swap(str, l, i);
				permutate(str, l+1, n);
				str=swap(str, l, i);
			}
		}
	}
	public String swap(String str,int a,int b)
	{
		char temp;
		char arr[]=str.toCharArray();
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}
  public static void main(String args[])
  {
	  PermutationString obj=new PermutationString();
	  String str="mukesh";
	  obj.permutate(str, 0, str.length()-1);
  }
}
