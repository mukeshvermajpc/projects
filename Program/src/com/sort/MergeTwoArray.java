package com.sort;
//program for merge two sorted array
public class MergeTwoArray {
	void merge(int arr[],int arr2[])
	{
	int n1=arr.length;
	int n2=arr.length;
	int n3=n1+n2;
	int arr3[]=new int[n3];
	int i=0,j=0;
	int k=0;
	while(i<n1&&j<n2)
	{
		if(arr[i]<arr2[j])
		{
			arr3[k]=arr[i];
			i++;
		}
		else {
			arr3[k]=arr2[j];
			j++;
		}
		k++;
	}
	while(i<n1)
	{
		arr3[k]=arr[i];
		k++;
		i++;
	}
	while(j<n2)
	{
		arr3[k]=arr2[j];
		k++;
		j++;
	}
	 for(int a:arr3)
	 {
		 System.out.print(a+" ");
	 }
	}
	public static void main(String args[]) {
     int arr[]= {2,4,6,8};
     int arr2[]= {3,5,7,9};
	 MergeTwoArray obj=new MergeTwoArray();
	 obj.merge(arr, arr2);
	}
}
