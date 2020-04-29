package com.string.two;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
	public static void main(String args[]) {
		System.out.println("program for find out frequency of character");
		String str = "picture perfect";
		char[] arr = str.replaceAll(" ", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : arr) {
			if(map.containsKey(ch))
			   map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);
		}
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
	}
}
