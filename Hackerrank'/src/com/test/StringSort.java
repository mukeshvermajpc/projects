package com.test;
public class StringSort {
   public static void sort(String arr[])
   {
	   int n=arr.length;
	   for(int i=0;i<n-1;i++)
	   {
		   for(int j=i+1;j<n;j++)
		   {
			   if(arr[i].compareTo(arr[j])>0)
			   {
				   String temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
			   }
		   }
	   }
   }
   public static void main(String[] args) {
	String arr[]= {"cd","ab","bc","ac"};
	StringSort.sort(arr);
	for(String str:arr)
	{
		System.out.println(str);
	}
}
}
