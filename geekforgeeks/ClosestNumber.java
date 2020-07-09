package geekforgeeks;

import java.util.Scanner;
/**
 *  Given two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

	Input:
	The first line consists of an integer T i.e number of test cases. T testcases follow.  The first and only line of each test case contains two space separated integers N and M.
	
	Output:
	For each testcase, in a new line, print the closest number to N which is also divisible by M.
	
	Constraints: 
	1 <= T <= 100
	-1000 <= N, M <= 1000
	
	Example:
	Input:
	2
	13 4
	-15 6
	Output:
	12
	-18
 *
 */
public class ClosestNumber {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		int []numbers = new int[cases*2];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<-1000||numbers[i]>1000)
					return;
	    }
		for(int i=0;i<numbers.length;i=i+2)
	    {
				System.out.println(getClosest(numbers[i],numbers[i+1]));
	    }
	}

	private static int getClosest(int n, int m) 
	{
		int lowerSideCount=1;
		int upperSideCount=1;
		int tmp = n;
		int tmp1 = n;
		while(true)
		{
			if(tmp%m==0)
				break;
			tmp=tmp-1;
			lowerSideCount++;
		}
		while(true)
		{
			if(tmp1%m==0)
				break;
			tmp1=tmp1+1;
			upperSideCount++;
		}
		if(lowerSideCount<upperSideCount)
		{
			return tmp;
		}
		if(lowerSideCount==upperSideCount)
		{
			if(Math.abs(tmp/m)<Math.abs(tmp1/m))
			{
				return tmp1;
			}
			else
				return tmp;
		}
		else
			return tmp1;
	}
}
