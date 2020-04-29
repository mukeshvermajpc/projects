package com.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
	public static void main(String args[]) {
       System.out.println("program for remove duplicate element from an array");
       int arr[]= {12,13,89,45,90,92,89,90,89,90,12};
       DuplicateArray da=new DuplicateArray();
       da.removeDupliate(arr);
	}
	void removeDupliate(int arr[])
	{
		Map<Integer,Integer>map=new HashMap<>();
		for(int a:arr)
		{
			if(map.containsKey(a))
			{
				map.put(a,map.get(a)+1);
			}
			else {
				map.put(a, 1);
			}
		}
		map.forEach((k,v)->{
			if(v>1)
			{
				System.out.println(k+" "+v);
			}
		});
	}
}
