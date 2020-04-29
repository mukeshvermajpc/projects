package com.pattern4;
public class ReverseString {
  public static String reverse(String str)
  {
	  if(str==null || str.length()<=0)
	  {
		  return str;
	  }
	  return reverse(str.substring(1))+str.charAt(0);
  }
  public static void main(String args[])
  {
	  System.out.println(reverse("mukesh"));
	  System.out.println(reverse("manish"));
	  System.out.println(reverse("ram"));
  }
}
