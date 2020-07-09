package geekforgeeks;

import java.util.Scanner;
/**
 * Given a number N, calculate the prime numbers upto N using Sieve of Eratosthenes.  

	Input: 
	The first line of the input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing N.
	
	Output: 
	For all testcases, in a new line, print all the prime numbers upto or equal to N.
	
	Constraints:
	1 <= T<= 100
	1 <= N <= 104
	
	Example:
	Input:
	2
	10
	35
	Output:
	2 3 5 7
	2 3 5 7 11 13 17 19 23 29 31 
 *
 */
public class Prime_SieveofEratosthenes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<1||numbers[i]>10000)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				printAllPrime(numbers[i]);
				System.out.println();
	    }
	}

	private static void printAllPrime(int input) 
	{
		int count=2;
		while(count<=input)
		{
			if(isPrime(count))
			{
				System.out.print(count+" ");
			}
			count++;
		}
	}

	private static boolean isPrime(int count) {
		int i=2;
		while(i<=count)
		{
			if(count%i==0 && count!= i)
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
