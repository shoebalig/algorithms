package geekforgeeks;

import java.util.Scanner;

public class PrimePairs {
/**
 *  Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.
 *
 *	Input:
 *	The first line of input contains an integer T denoting the number of test cases. T testcases follow.
 *	The first line of each test case is N.
 *	
 *	Output:
 *	For each testcase, in a new line, print the all pairs of prime numbers in increasing order.
 *	
 *	Constraints:
 *	1 ≤ T ≤ 50
 *	4 ≤ N ≤ 400
 *	
 *	Example:
 *	Input:
 *	2
 *	4
 *	8
 *	Output:
 *	2 2
 *	2 2 2 3 3 2
 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>50)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<4||numbers[i]>400)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				primePairs(numbers[i]);
	    }
	}
	
	private static void primePairs(int input) {
		String number = getPrime(input);
		String[] numbers = number.split(",");
		if(numbers.length==1) {
			System.out.println(numbers[0]+" "+numbers[0]);
			return;
		}
		String output = "";
		for (int i = 0; i<numbers.length; i++) 
            for (int j = 0; j< numbers.length; j++)
            	if(Integer.parseInt(numbers[i])*Integer.parseInt(numbers[j])<=input)
            	{
            		output = output+numbers[i]+" "+numbers[j]+" "; 
            	}
		System.out.println(output.trim());

	}

	private static String getPrime(int input) {
		String num = "2";
		int count = 3;
		while (count <= input) {
			if (isPrime(count)) {
					num = num +","+ count;
			}
			count++;
		}
		return num;
	}

	private static boolean isPrime(int count) {
		if (count == 2 || count == 3)
			return true;
		int i = 2;
		while (i <= count) {
			if (count % i == 0 && i != count)
				return false;
			i++;
		}
		return true;
	}

}
