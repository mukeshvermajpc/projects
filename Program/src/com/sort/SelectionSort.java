package com.sort;

public class SelectionSort {
	public static void main(String args[]) {
		System.out.println("Program for selection sort");
		System.out.println("before sorting");
		SelectionSort obj=new SelectionSort();
		int arr[]= {12,32,34,10,89,9};
		obj.print(arr);
		obj.sort(arr);
		System.out.println("\n After sorting");
		obj.print(arr);
		
	}

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <n - 1; i++) {
			for (int j = i + 1; j< n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	void print(int arr[]) {
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}
}
