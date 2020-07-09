package geekforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
/**
 * Given a value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. The only line of each test case contains an integer N.

Output :
For each testcase, in a new line, print the answer of each test case.

Constraints :
1 <= T <= 103
1 <= N <= 1012

Example:
Input :
3
6
10
30

Output :
1
2
3

Explanation:
Testcase 1: There is only one number 4 which has exactly three divisors 1, 2 and 4.
 * @author shoekhan
 *
 */
public class ThreeDivisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int cases = Integer.parseInt(br.readLine()); 
		if(cases<1||cases>1000)
			return;
		long[] numbers =new long[cases];
		for(int i=0;i<cases;i++)
	    {
				numbers[i] = Long.parseLong(br.readLine());
				//							1000000000000
				if(numbers[i]<1||numbers[i]>1000000000000l)
					return;
	    }
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(getNumberThreeDevison(numbers[i]));
		}
		br.close();
	}

	private static int getNumberThreeDevison(long number) 
	{
		int count = 0;
		boolean numbers[] = sieveAllPrimes(number);
		for (int i = 2; i*i<=number; i++) 
		{
			if (((i*i))<=number && !numbers[i])
				count++;
		}
		return count;
	}

	private static boolean[] sieveAllPrimes(long number) 
	{
		boolean[] numbers =new boolean[(int) number];
		for (int i = 2; i < numbers.length; i++) {
			for (int j = i*2; j < numbers.length; j=j+i) {
				if(!numbers[j])
					numbers[j] = true;
			}
		}
		return numbers;
	}
}
