package com.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateString {
//program for count duplicate string
	public static void main(String args[])
	{
		String str="mukesh kumar software engineer product development raushan kumar product engineer shashank kumar product enginner";
		String arr[]=str.split(" ");
		DuplicateString obj=new DuplicateString();
		obj.removeDuplicate(arr);
	}
	public void removeDuplicate(String arr[])
	{
	    Map<String,Integer>map=new LinkedHashMap<>();
	    for(String st:arr)
	    {
	    	if(map.containsKey(st))
	    	{
	    		map.put(st, map.get(st)+1);
	    	}
	    	else {
	    		map.put(st,1);
	    	}
	    }
	    map.forEach((k,v)->{
	    		System.out.println(k+" "+v);
	    });
	}
}
