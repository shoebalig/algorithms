package com.gfg.arrays;

import java.util.Arrays;

public class SumWithTwo {
	public static void main(String[] args)  
    { 
        //int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int arr[] ={769082435 ,210437958 ,673982045 ,375809214 ,380564127};
        int n = arr.length; 
        int sum = 23; 
        miniMaxSum(arr);
        subArraySum(arr, n, sum); 
    }

	private static void subArraySum(int[] arr, int n, int sum) {
		
		
	}
	static void miniMaxSum(int[] arr) {
        Arrays.sort(arr,0,arr.length);
        long sumMin=0;
        long sumMax=0;
        for(int i=0;i<5;i++)
        {
            sumMin=sumMin+arr[i];
        }
        for(int i=0;i<5;i++)
        {
            sumMax=sumMax+arr[arr.length-i-1];
        }
        System.out.println(sumMin +" "+sumMax);
    }

}
