package geekforgeeks;

import java.util.Scanner;

/**
 * Given two numbers A and B, find Kth digit from right of AB.

	Input:
	The first line of the input contains T denoting the number of test cases. T testcases follow.  Each of the next T lines contains three space separated positive integers denoting the value of a , b and k respectively.
	
	Output:
	For each test case, in a new line, output the Kth digit from right of AB in new line.
	
	Constraints:
	1 <= T <= 100
	1 <= A , B <=15
	1 <= K <= |totaldigits in AB|
	
	Example:
	Input:
	2
	3 3 1
	5 2 2
	Output:
	7
	2
 * @author shoekhan
 *
 */
public class PrintKthDigit {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
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
			if(((i*3)+2)<list.length)
				System.out.println((getKthDigit(list[(i*3)],list[((i*3))+1],list[((i*3))+2])));
		}
		
	}

	private static long getKthDigit(int first, int second, int kth) {
		long multiple = (long)Math.pow(first, second);
		long i=1,digit=0;
		while(multiple>0 && i<=kth)
		{
			digit = multiple%10;
			multiple=multiple/10;
			i++;
		}
		return digit;
	}


}
