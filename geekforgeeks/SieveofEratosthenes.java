package geekforgeeks;

import java.util.Scanner;

public class SieveofEratosthenes {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		printNumber(100);
	}

	private static void printNumber(int input) 
	{
		boolean array[]= new boolean[input+1];
		for (int i = 2; i <array.length; i++) 
		{
			for (int j = i*2; j <array.length; j=j+i) {
				array[j]=true;
			}
			
		}
		for (int i = 1; i <array.length; i++) {
			if(array[i]==false)
				System.out.println(i);
		}
	}

}
