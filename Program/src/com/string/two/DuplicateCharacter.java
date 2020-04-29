package com.string.two;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacter {
  public static void main(String args[])
  {
	  String str="Great responsiblity";
	  Map<Character,Integer>map=new LinkedHashMap<>();
	  for(char ch:str.replaceAll(" ","").toCharArray())
	  {
		  if(map.containsKey(ch))
			   map.put(ch, map.get(ch)+1);
		  else
			  map.put(ch, 1);
	  }
	  System.out.println("List of repeated character is:");
	  map.forEach((key,value)->{
		  if(value>1)
			  System.out.println(key);
	  });
  }
}
