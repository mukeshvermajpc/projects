package com.stream;

import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
  public static void main(String args[])
  {
	  Map<String,String>mp=new HashMap<>();
	  mp.put("Mumbai", "Maharastra");
	  mp.put("Lucknow", "Uttar Pradesh");
	  mp.put("Bhopal", "Madhya Pradesh");
	  mp.put("Gurugram", "Haryana");
      mp.forEach((key,value)->{
    	  System.out.println(key+" "+value);
      });
      System.out.println("-- printing map using java 7 ---");
      for(Map.Entry<String, String>m:mp.entrySet())
      {
    	  System.out.println(m.getKey()+" "+m.getValue());
      }
  }
  
}
