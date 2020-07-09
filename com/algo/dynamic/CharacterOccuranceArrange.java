package com.algo.dynamic;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterOccuranceArrange {
//Group all occurrences of characters according to first appearance
//Input : str = "geeksforgeeks"
//Output:  ggeeeekkssfor
	
	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);  // Reading from System.in
//		System.out.println("Enter a long Random String: ");
//		String input = reader.nextLine(); // Scans the next token of the input as an int.
//		
		printString("shoebkhandhakrani");
		printString("geeksforgeeks");
	}

	private static void printString(String input) {
		int k=0;
		ArrayList<Integer> used= new ArrayList<>();
		char[] arrayme= input.toCharArray();
		System.out.println("array me.length:= "+ arrayme.length);
		while(k<arrayme.length)
		{
			
			for (int i = k; i < arrayme.length; i++) {
				if(arrayme[k]==arrayme[i]&&!used.contains(i))
				{
					System.out.print(arrayme[k]);
					used.add(i);
				}
			}
			k++;
		}
	}
	
}
