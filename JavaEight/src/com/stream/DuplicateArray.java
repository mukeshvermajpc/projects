package com.stream;
public class DuplicateArray {
    public static void main(String[] args) {
		int arr[]= {10,12,10,12,13,13,89};
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
				
			}
		}
	}
}
