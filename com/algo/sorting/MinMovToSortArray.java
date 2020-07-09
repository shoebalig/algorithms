package com.algo.sortings;

public class MinMovToSortArray 
{
	private static int count=0;

	public static void main(String[] args) 
	{
		int arr[]={1,2,5,3,4,7,6,11,8,52,32,9};
		findMinimum(arr);
	}

	private static void findMinimum(int[] arr) 
	{
		for (int i=0;i<arr.length-1;i++)
		{
			int current=arr[i];
			int next=arr[i+1];
			if(next<current)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	/*private static int getRightPosition(int i, int[] arr)
	{
		return 0;
	}*/

}
