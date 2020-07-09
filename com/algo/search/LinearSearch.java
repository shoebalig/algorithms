package com.algo.search;

public class LinearSearch {
	//static int arr[] = {0,1,1,2,2,2,3,3,4,4,4,5,5,6};
	static int arr[] = {0,1,1,2,2,2,3,3,4,5,5,6};
	public static void main(String[] args) {
		System.out.println(lenearSearch(arr, 4, 0, arr.length-1 ));
	}

	private static int lenearSearch(int[] arr, int key, int start, int end) {
		if(end>=start)
		{
			for (int i = start; i <= end; i++) {
				if(arr[i]==key)
				{
					return i;
				}
			}
		}
		return -1;
	}


}
