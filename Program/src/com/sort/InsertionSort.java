package com.sort;

public class InsertionSort {
	public static void main(String args[]) {
		System.out.println("Program for insertion sort");
		int arr[] = { 12, 32, 45, 9, 89 };
	    System.out.println("Element before sorting");
	    InsertionSort obj=new InsertionSort();
	    obj.printArray(arr);
	    obj.sort(arr);
	    System.out.println("\n After sorting element");
	    obj.printArray(arr);
	}

	void sort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++)
		{
			int k=arr[i];
			int j=i-1;
			while(j>=0 &&arr[j]>k)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;
		}
	}

	void printArray(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
