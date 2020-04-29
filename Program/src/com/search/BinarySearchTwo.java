package com.search;
public class BinarySearchTwo {
	public static int search(int arr[],int l,int h,int search)
	{
		int pos=-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(arr[m]==search)
			  return m;
			if(search<arr[m])
				h=m-1;
			else
				l=m+1;
		}
		return -1;
	}
   public static void main(String args[])
   {
	   int arr[]= {10,11,12,13,14,15,16,17,18,19,20};
       int st=search(arr,0,arr.length,10);
       if(st==-1)
       {
    	   System.out.println("search element is not found");
       }
       else {
    	   System.out.println("searched element found at "+st);
       }
   }
}
