package com.algo.dynamic;

public class MaximumSum {

	public static void maximumSumAlternatingSubsequenceSum(int[] arr)
	{
		 int sum=0;
		int defaulterMatchCount=0;
		boolean isLastIncrease=true;
		 boolean isLastDecrease=true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]&&isLastDecrease)
			{
				if(defaulterMatchCount==0)
				{
					sum=sum+arr[i]+arr[i+1];
					System.out.print(arr[i]+" "+arr[i+1]+" ");
				}
				else if(defaulterMatchCount!=0)
				{
					sum=sum+arr[i+1];
					System.out.print(arr[i+1]+" ");
				}
				isLastIncrease=true;
				isLastDecrease=false;
				defaulterMatchCount++;
				
			}
			else if(arr[i]<arr[i+1]&&isLastIncrease)
			{
				isLastIncrease=false;
				isLastDecrease=true;
				if(defaulterMatchCount==0)
				{
					sum=sum+arr[i]+arr[i+1];
					System.out.print(arr[i]+" "+arr[i+1]+" ");
					
				}
				else if(defaulterMatchCount!=0)
				{
					sum=sum+arr[i+1];
					System.out.print(arr[i+1]+" ");
				}
				defaulterMatchCount++;
			}
			else
			{
				defaulterMatchCount++;
			}
		}
		System.out.println("\nSum of total:-  "+sum);
		sum=0;
	}
	public static void main(String[] args) {
		int arr[] = {4, 3, 2, 5, 3, 8};
		int arr1[] = {4, 3, 2, 5, 3, 8,7,1,2,3};
		int arr2[] = {4, 3, 2, 5, 3, 8,3,7,1,2,3,10};
		int arr3[] = {4, 8, 2, 5, 6, 8};
		int arr4[] = {4, 3, 8, 5, 3, 8};
		maximumSumAlternatingSubsequenceSum(arr);
		maximumSumAlternatingSubsequenceSum(arr1);
		maximumSumAlternatingSubsequenceSum(arr2);
		maximumSumAlternatingSubsequenceSum(arr3);
		maximumSumAlternatingSubsequenceSum(arr4);
	}
}
