package com.algo.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//this program to print all combinations of consecutive numbers whos sum equals to the given number... 
public class ConsecutiveSum {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int input = reader.nextInt(); // Scans the next token of the input as an int. 
		int sum = 0,k=1;
		boolean flag = false;
		int j=1;
		List<Integer> count = new ArrayList<Integer>();
			for (int i = j; i <= input / 2 + 1; i++) {
				sum = sum + i;
				count.add(i);
				if (sum > input) {
					flag=true;
					sum=0;
					i=k;
					k++;
				}
				if (sum == input) {
					for (int l = 0; l < count.size(); l++) {
						System.out.print(count.get(l));
					}
					System.out.print("\n");
					
				}
				if(flag)
				{
					count=new ArrayList<>();
					flag=false;
				}
			}
	}

}
