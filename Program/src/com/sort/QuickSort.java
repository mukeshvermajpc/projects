package com.sort;
//program for quick sort
public class QuickSort {
   public static void main(String args[])
   {
	   int arr[]= {15,10,8,19,89,45};
	   QuickSort obj=new QuickSort();
	   obj.sort(arr, 0, arr.length-1);
	   for(int a:arr)
	   {
		   System.out.println(a);
	   }
   }
   void sort(int arr[],int l,int h)
   {
	   if(l<h)
	   {
		   int pi=partition(arr, l,h);
		   sort(arr,l,pi-1);
		   sort(arr,pi+1,h);
	   }
   }
   int partition(int arr[],int low,int high)
   {
	   int pivot=arr[high];
	   int i=(low-1);
	   for(int j=low;j<high;j++)
	   {
		   if(arr[j]<pivot)
		   {
			   i++;
			   int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		   }
	   }
		   int temp=arr[i+1];
		   arr[i+1]=arr[high];
		   arr[high]=temp;
	   return i+1;
   }
}
