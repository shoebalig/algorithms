package geekforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if (cases < 1 || cases > 100)
			return;
		int[] numbers = new int[cases];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = reader.nextInt();
			if (numbers[i] < 1 || numbers[i] > 10000)
				return;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(pairCubesCount(numbers[i]));
		}
	}

	private static int pairCubesCount(int input) {
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (i * i * i == input)
				count++;
			for (int j = 1; j <= input; j++) {
				if ((i!=j)&&(i * i * i) + (j * j * j) == input)
					count++;
			}
		}
		return count;
	}
}
