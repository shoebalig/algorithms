package com.algo.search;

public class BinarySearch {
	static int arr[] = {0,1,1,2,2,2,3,3,4,5,5,6};
	public static void main(String[] args) {
		System.out.println(binarySearch(arr, 0, arr.length-1 ,4));
	}
	private static int binarySearch(int[] arr, int start, int end, int key) {
		if(end>=start)
		{
			int mid = (end+start)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			if(key>arr[mid])
			{
				return binarySearch(arr,mid+1, end, key);
			}
			else
			{
				return binarySearch(arr,start, mid-1, key);
			}
		}
		return -1;
	}
}
