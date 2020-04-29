package com.search;
public class BinarySearch {
	public static int search(int arr[],int l,int h,int search)
	{
      if(l<=h)
      {
    	  int m=l+(h-1)/2;
       if(arr[m]==search)
    	   return m;
        if(arr[m]>search)
    	   return search(arr,l,m-1,search); 
    	  return  search(arr,m+1,h,search);
       }
       return -1;
    	   
	}
   public static void main(String args[])
   {
	   System.out.println("program for understand binary search");
       int arr[]= {12,13,14,15,16,17,18,19,20};
       int search=97;
       int n=arr.length;
       int a=search(arr,0,n,search);
       if(a==-1)
       {
    	   System.out.println("element is not found");
       }
       else {
    	   System.out.println("element is found at "+a);
       }
   }
}
