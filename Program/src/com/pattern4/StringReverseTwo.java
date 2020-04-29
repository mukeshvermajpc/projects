package com.pattern4;

public class StringReverseTwo {
	public static String reverse(String str) {
		String rev = "";
		if (str == null)
			return str;
		else {
			for (int i = str.length()-1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
		}
		return rev;
	}
	public static void main(String args[]) {
        System.out.println(reverse("ram"));
        System.out.println("mukesh");
        String str="i love my india";
        for(String s:str.split(" "))
        {
        	System.out.print(reverse(s)+" ");
        }
        
	}
}
