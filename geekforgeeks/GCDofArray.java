package geekforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.

	Input:
	First line of input contains number of test cases T. First line of test case contains a positive integer N, size of the array. Next line contains the array elements.
	
	Output:
	For each testcase, print the GCD of array elements.
	
	Constraints:
	1 <= T <= 100
	1 <= N <= 106
	1 <= Arr[i] <= 106
	
	Example:
	Input:
	1
	2
	5 10
	
	Output:
	5
 *
 */
public class GCDofArray {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		List<int []> arrayList= new ArrayList<>(cases);
		for(int i=0;i<cases;i++) 
		{
			int arraySize = reader.nextInt();
			if(arraySize<1||arraySize>100000)
				return;
			int []arrays = new int[arraySize];
			for(int j=0;j<arrays.length;j++)
		    {
				arrays[j]=reader.nextInt();
				if(arrays[j]<1||arrays[j]>100000)
					return;
		    }
			arrayList.add(arrays);
	    }
		for (int[] input : arrayList) 
		{
			System.out.println(getArrayGCD(input));
		}
		
	}

	private static int getArrayGCD(int[] input) 
	{
		if(input.length<2)
			return input[0];
		int count =2;
		boolean flag=false;
		int large= getLargestNo(input);
		while(count<large)
		{
			if(isDivisible(count,input))
			{
				flag = true;
				break;
			}
			count++;
		}
		if(flag)
			return count;
		else
			return 1;
	}

	private static boolean isDivisible(int count, int[] input) 
	{
		for (int i = 0; i < input.length; i++) 
		{
			if(input[i]%count!=0)
				return false;
		}
		return true;
	}

	private static int getLargestNo(int[] input) {
		int LARGE=input[0];
		for (int i = 0; i < input.length; i++) 
		{
			if(input[i]>LARGE)
				LARGE= input[i];
		}
		return LARGE;
	}

}
