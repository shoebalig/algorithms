package com.algo.backtracking;

public class Permutation {

	public static void main(String[] args) {

		String input = "ABC";
		char arr[] = input.toCharArray();
		permuter(arr);
	}

	private static void permuter(char arr[]) {
		permuterHelper(arr, 0);
	}

	private static void permuterHelper(char[] arr, int start) 
	{
		if(start>=arr.length)
		{
			printArray(arr);
		}
		for (int i = start; i < arr.length; i++) {
																   //BAC
			swap(arr,start,i);				// 00,11,22->> ABC //01 BAC// 02, CAB
			permuterHelper(arr,start+1);	// 1,2, 
			swap(arr,start,i);				// 21,ACB //20, CBA  
		}
	}

	private static void swap(char[] arr, int start, int currentIndex) 
	{
		char t = arr[start];
		arr[start] = arr[currentIndex];
		arr[currentIndex] = t;
	}

	private static void printArray(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
