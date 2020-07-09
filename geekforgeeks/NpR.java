package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 *
 * Calculate nPr based on formulae n!/(n-r)!
 * Enter number of test cases and then value of n and then value of r for each test case.
 */
public class NpR {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		int [][]numbers = new int[cases][2];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i][0] = reader.nextInt();
				numbers[i][1] = reader.nextInt();
				if(numbers[i][0]<1||numbers[i][1]>20)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(nPr(numbers[i][0],numbers[i][1]));
	    }
	}

	private static long nPr(int n, int r) {
		
		return fact(n)/fact(n-r);
	}
	static long fact(int number)
	{
		long fact = 1;
		while(number>0)
		{
			fact = fact*number;
			number = number-1;
		}
		return fact;
	}

}
