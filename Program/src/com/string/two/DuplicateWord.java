package com.string.two;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
	public static void main(String args[]) {
		System.out.println("program for find out duplicate word in string");
		String str = "mukesh kumar verma software engineer product development mukesh kumar verma software engneer product development";
		Map<String,Integer>map=new HashMap<>();
		for(String st:str.split(" "))
		{
			if(map.containsKey(st))
				map.put(st, map.get(st)+1);
			else
				map.put(st, 1);
		}
		map.forEach((key,value)->{
			if(value>1)
				System.out.println(key);
		});
	}
}
