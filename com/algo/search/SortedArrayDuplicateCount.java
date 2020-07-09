package com.algo.search;

public class SortedArrayDuplicateCount {
	static int arr[] = {0,1,1,2,2,2,3,3,4,4,4,4,4,5,5,6};
	public static void main(String[] args) {
		System.out.println(getCount(arr, 0, arr.length-1 ,4));
	}
	private static int getCount(int[] arr, int start, int end, int key) {
		
		int first = getBinarySearchFirst(arr, start, end, key);
		System.out.println(first);
		int last = getBinarySearchLast(arr, start, end, key);
		System.out.println(last);
		return (last-first)+1;
	}
	private static int getBinarySearchFirst(int[] arr, int start, int end, int key) {
		if(end>=start)
		{
			int mid = (end+start)/2;
			if(arr[mid]==key && arr[mid-1]!=key)
			{
				return mid;
			}
			//cover edge case of equal in else part
			if(key>arr[mid])
			{
				return getBinarySearchFirst(arr, mid+1,end,key);
			}
			else
			{
				return getBinarySearchFirst(arr, start, mid-1,key);
			}
		}
		return -1;
	}
	private static int getBinarySearchLast(int[] arr, int start, int end, int key) {
		if(end>=start)
		{
			int mid = (end+start)/2;
			if(arr[mid]==key && arr[mid+1]!=key)
			{
				return mid;
			}
			//cover edge case of equal in if part
			if(key>=arr[mid])
			{
				return getBinarySearchLast(arr, (mid+1),end,key);
			}
			else
			{
				return getBinarySearchLast(arr, start, (mid-1),key);
			}	
		}
		return -1;
	}
}
