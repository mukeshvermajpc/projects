package com.stream;
//program for print only unique element in java
public class NoDuplicate {
    public static void main(String args[])
    {
    	int arr[]= {12,13,12,14,19};
    	int n=arr.length;
    	boolean status=true;
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=1;j<n;j++)
    		{
    			if(arr[i]==arr[j])
    			{
    				arr[j]=-1;
    			}
    		}
    	}
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]!=-1)
    			System.out.println(arr[i]);
    	}
    }
}
