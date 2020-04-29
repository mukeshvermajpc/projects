package com.rank;

import java.util.HashMap;
import java.util.Map;

public class MinimumDistance {
	Map<Integer,Integer>map=new HashMap<>();
	void minimum(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int x=map.get(arr[i]);
				//System.out.println(x);
				int dist=i-x;
				if(dist<min)min=dist;
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		if(min==Integer.MAX_VALUE)min=-1;
		System.out.println(min);
	}
   public static void main(String args[])
   {
	  System.out.println("hacker rank problem for find distance between two point");
      int arr[]= {1,1};
      MinimumDistance obj=new MinimumDistance();
      obj.minimum(arr);
   
   }
}
