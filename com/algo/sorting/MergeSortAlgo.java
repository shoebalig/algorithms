package com.algo.sortings;

public class MergeSortAlgo {
	public static void main(String[] args) {
		int a[]={11,3,5,2,52,13,33,10,8};
		new MergeSortAlgo().mergeSort(a);
		seeElement(a);
	}

	private void mergeSort(int[] a) {
		if(a.length<2)
			return;
		int mid=a.length/2;
		int left[]=new int[mid];
		int right[]=new int[a.length-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=a[i];
		}
		int k=0;	
		for(int j=mid;j<a.length;j++)
		{
			
			right[k]=a[j];
			k=k+1;
		}
		mergeSort(left);
		mergeSort(right);
		mergeSortedArray(left,right,a);
	}
	static void seeElement(int[] ele)
	{
		for (int i = 0; i < ele.length; i++) {
			System.out.print(" " +ele[i]+",");
			
		}
	}
	private void mergeSortedArray(int[] left, int[] right,int[] result) {
		int i=0,j=0,resultSize=0;
		//seeElement(left);
		//seeElement(right);
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				result[resultSize]=left[i];
				i++;
			}
			else
			{
				result[resultSize]=right[j];
				j++;
			}
			resultSize++;
		}
		while(i<left.length)
		{
			result[resultSize]=left[i];
			i++;resultSize++;
		}
		while(j<right.length)
		{
			result[resultSize]=right[j];
			j++;resultSize++;
		}
	}

}
