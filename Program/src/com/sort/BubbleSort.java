package com.sort;
public class BubbleSort {
  public static void main(String args[])
  {
	  System.out.println("program for bubble sort");
      int arr[]= {17,12,90,9};
      BubbleSort obj=new BubbleSort();
      System.out.println("Array element before sorting");
      obj.printArr(arr);
      obj.sort(arr);
      System.out.println("\nArray element after sorting");
      obj.printArr(arr);
  }
  void sort(int arr[])
  {
	  int n=arr.length;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n-1-i;j++)
		  {
			  if(arr[j+1]<arr[j])
			  {
				  int temp=arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
  }
  void printArr(int arr[])
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
  }
}
