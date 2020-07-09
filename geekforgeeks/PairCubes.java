package geekforgeeks;

import java.util.Scanner;

public class PairCubes {
/**
 * Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.

	Input:
	The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains integer N.
	
	Output:
	For each testcase, in a new line, print count of all 'a' and 'b' that satisfy the above equation.
	
	Constraints:
	1 <= T <= 100
	a>=1, b>=0
	1 <= N <= 105
	
	Example:
	Input:
	2
	9
	28
	
	Output:
	2
	2
 */
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

	private static long pairCubesCount(int input) {
		long count = 0;
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j <= input; j++) {
				if ((i!=j)&&(i * i * i) + (j * j * j) == input)
					count++;
			}
		}
		return count;
	}
}
