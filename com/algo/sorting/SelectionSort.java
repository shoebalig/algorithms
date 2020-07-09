package com.algo.sortings;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]={42,3,4,10,8,22,2,7,20};
		selectionSort(a);
	}

	private static void selectionSort(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
