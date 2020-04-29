package com.array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void removeDuplicate(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[n-1];
					n--;
					j--;
				}
			}
		}
		System.out.println(n);
		int ar[]=Arrays.copyOf(arr,n);
		for(int a:ar)
		{
			System.out.print(a+" ");
		}
	}
	
  public static void main(String args[])
  {
	  System.out.println("program for remove duplicate element");
	  int arr[]= {1,9,6,8,9,6,5};
	  removeDuplicate(arr);
  }
}
