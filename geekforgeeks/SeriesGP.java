package geekforgeeks;

import java.util.Scanner;

/**
 * Given the first 2 terms A and B of a Geometric Series, tell the Nth term of the series.
	Input:
	First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case in its first line contains two positive integer A and B (First 2 terms of GP). In the second line of every test case it contains of an integer N.
	Output:
	In each seperate line print the Nth term of the Geometric Progression. Print the floor ( floor(2.3)=2 ) of the answer.
	Constraints:
	1 <= T <= 30
	-100 <= A <= 100
	-100 <= B <= 100
	1 <= N <= 5
	Example:
	Input:
	2
	2 3
	1
	1 2
	2
	Output:
	2
	2
 *
 */
public class SeriesGP {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>30)
			return;
		int []list = new int[(cases*3)];
		for(int i=0;i<list.length;i++)
	    {
				list[i] = reader.nextInt();
	    }
		if(list.length<cases*3)
			return;
		
		for (int i = 0; i < cases; i++) 
		{
			if((list[((i*3))+2])==1)
			{
				System.out.println(list[((i*3))]);
			}
			if((list[((i*3))+2])==2)
			{
				System.out.println(list[((i*3))+1]);
			}
			if(((i*3)+2)<list.length && (list[((i*3))+2])>2)
				System.out.println((getNthTerm(list[(i*3)],(((float)list[((i*3))+1]/(float)list[(i*3)])),list[((i*3))+2])));
		}
		
	}

	private static int getNthTerm(float start, float r, float term) 
	{
		
		double sum = start*Math.pow(r,term-1);
		return (int)Math.floor(sum);
	}
}
