package com.algo.search;

public class RotationIndexSortedArray {
	static int arr[] = {8,9,10,1,2,3,4,5,6,7};
	public static void main(String[] args) {
		System.out.println(getRotationIndex(arr, 0, arr.length-1));
	}
	private static int getRotationIndex(int[] arr, int start, int end)
	{

		if(end>=start)
		{
			int mid= (end+start)/2;
			if(arr[mid]>arr[mid+1])
			{
				return mid;
			}
			if(arr[start]>arr[mid])
			{
				return getRotationIndex(arr, start,mid-1);
			}
			else
			{
				return getRotationIndex(arr, mid+1, end);
			}
		}
		return -1;
	}

}
