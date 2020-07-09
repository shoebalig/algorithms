package com.gfg.arrays;

import java.util.Arrays;

public class SumWithThree {

	public static void main(String[] args)  
    { 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        subArraySum(arr, n, sum); 
    }

	private static void subArraySum(int[] arr, int n, int sum) {
		
		Arrays.sort(arr, 0, n);
		int start=0;
		int end=arr.length;
		for (int i = 0; i < arr.length-3;i++) {
			end=arr.length-1;
			start=0;
			for (int j = i+1; j < end; ) 
			{
				if(arr[i]+arr[j]+arr[end]>sum)
				{
					end=end-1;
				}
				if(arr[i]+arr[j]+arr[end]<sum)
				{
					j++;
				}
				if(arr[i]+arr[j]+arr[end]==sum)
				{
					System.out.println(arr[i]+"+"+arr[j]+"+"+arr[end]);
					break;
				}
			}
		}
		
	} 

}
