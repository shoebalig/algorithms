package com.algo.sortings;

public class BubbleSort {
		public static void main(String[] args) {
			int a[]={42,3,4,10,8,22,2,7,20};
			selectionSort(a);
		}

		private static void selectionSort(int[] a) {
			for(int j=1;j<a.length;j++)
			{
				for(int i=0;i<a.length-1;i++)
				{
					if(a[i]>a[i+1])
					{
						int temp=a[i+1];
						a[i+1]=a[i];
						a[i]=temp;
					}
				}
			}

			for (int i : a) {
				System.out.println(i);
			}
		}
}