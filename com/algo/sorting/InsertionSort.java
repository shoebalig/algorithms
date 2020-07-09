package com.algo.sortings;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 42, 3, 4, 10, 8, 22, 2, 7, 20 };
		insertionSort(a);
	}

	private static void insertionSort(int[] a) {
		for (int i = 0; i <a.length; i++) {
			int low = 0, k=0,high=0;
			if(i>0)
			{
				high = i - 1;
			}
			int element = a[i];
			while (high - low > 1) {
				int j = (high + low) / 2;
				if (element <= a[j])
					high = j;
				else
					low = j;
			}
			for (k = i; k > high; k--) {
				a[k] = a[k - 1];
				a[high] = element;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
