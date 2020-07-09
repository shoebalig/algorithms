package com.algo.sortings;

public class SortAll {
	public static void main(String[] args) {
		int data[]= { 6, 3, 4, 10, 8, 22, 2, 7, 20 };
		int bubbleData[]= { 42, 3, 4, 10, 8, 22, 2, 7, 20,66,1,9,7,5 };
		int mergeSortData[]= { 42, 3, 4, 10, 8, 22, 2, 7, 20,66,1,9,7,5,21};
		selectionSort(data);
		bubbleSort(bubbleData);
		mergeSort(mergeSortData);
		insertionSort(mergeSortData);
	}

	private static void insertionSort(int[] mergeSortData) {
		
		for (int i = 0; i < mergeSortData.length-1; i++) {
			if(mergeSortData[i]>mergeSortData[i+1])
			{
				int high=i,low=0;
				int temp=mergeSortData[i];
				mergeSortData[i]=mergeSortData[i+1];
				mergeSortData[i+1]=temp;
				while(high>low)
				{
					if(mergeSortData[high]<mergeSortData[high-1])
					{
						int tempr=mergeSortData[high-1];
						mergeSortData[high-1]=mergeSortData[high];
						mergeSortData[high]=tempr;
					}
					high--;
				}
			}
		}
		for (int i = 0; i < mergeSortData.length; i++) {
			System.out.println(mergeSortData[i]);
		} 
		
	}

	private static void mergeSort(int[] mergeSortData) {
		sort(mergeSortData);
		for (int i = 0; i < mergeSortData.length; i++) {
			System.out.println(mergeSortData[i]);
		}
	}

	private static void sort(int[] mergeSortData) {
		if(mergeSortData.length<2)
			return;
		int mid=mergeSortData.length/2;
		int k=0;
		int left[]=new int[mid];
		int right[]=new int[mergeSortData.length-mid];
		for(int i=0;i<left.length;i++)
		{
			left[i]=mergeSortData[k];
			k++;
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=mergeSortData[k];
			k++;
		}
		sort(left);
		sort(right);
		mergeNow(left, right,mergeSortData);
	}

	private static void mergeNow(int[] left, int[] right, int[] mergeSortData) {
		int i=0,j=0,k=0;
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				mergeSortData[k]=left[i];
				i++;
			}
			else
			{
				mergeSortData[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			mergeSortData[k]=left[i];
			i++;k++;
		}
		while(j<right.length)
		{
			mergeSortData[k]=right[j];
			j++;k++;
		}
	}

	private static void bubbleSort(int[] data) {
		for(int i=0;i<data.length;i++)
		{
			for (int j = 0; j < data.length-1; j++) 
			{
				if(data[j]>data[j+1])
				{
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}	
		System.out.println("Bubble Sort:- ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

	private static void selectionSort(int[] data) {
		for(int i=0;i<data.length;i++)
		{
			for (int j = i+1; j < data.length; j++) {
				if(data[i]>data[j])
				{
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
				
			}
		}
		System.out.println("Selection Sort:- ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
