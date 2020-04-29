package com.string;
public class PermutationString {
	static void permutation(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		boolean alpha[]=new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			if(alpha[ch-'a']==false)
			{
				permutation(ros, ans+ch);
			}
			alpha[ch-'a']=true;
			
		}
	}
  public static void main(String args[])
  {
	  permutation("abcd", "");
  }
}
