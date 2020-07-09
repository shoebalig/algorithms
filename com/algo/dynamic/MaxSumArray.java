package com.gfg.arrays;

public class MaxSumArray {
	public static void main(String[] args) {
		int arr[] = {-1, -2, 2, -2, -1, 5, -10, -3}; 
	    int n = arr.length; 
	    System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		int sum =0, sumprev=0,start=-1,end=0;
		for (int i = 0; i < arr.length; i++) {
			if(sum+arr[i]>=sumprev)
			{
				sum =sum+arr[i];
				if(start<0)
				{
					start=i;
				}
				end++;
			}
			else
			{
				if(sum>sumprev)
				{
					sumprev=sum;
				}
			}
		}
		
		for (int i = start; i <=end+1; i++) 
		{
			System.out.println(arr[i]);
		}
		return sumprev;
	}
	
}
//if(sum+arr[i]>0)
//{
//	sum =sum+arr[i];
//}
//else
//{
//	sum=0;
//}
//if(sum>sumprev)
//{
//	sumprev=sum;
//}
