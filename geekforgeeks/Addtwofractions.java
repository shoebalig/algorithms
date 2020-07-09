package geekforgeeks;

import java.util.Scanner;

/**
 * You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx).

	Input Format:
	The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .
	
	Output Format:
	For each test case, in a new line,  output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.
	
	Your Task:
	Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function addFraction  which adds the two fractions and prints the resulting fraction. The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.
	
	Constraints:
	1 <= T <= 100
	1 <= den1,den2,num1,num2 <= 1000
	
	Example:
	Input
	1
	1 500 2 500
	Output
	3/500
	
	Explanation:
	In above test case 1/500+2/500=3/500
 *
 */
public class Addtwofractions {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		int []list = new int[(cases*4)];
		for(int i=0;i<list.length;i++)
	    {
				list[i] = reader.nextInt();
				if(list[i]<1||list[i]>1000)
					return;
	    }
		if(list.length<cases*4)
			return;
		
		for (int i = 0; i < cases; i++) 
		{
			if(((i*3)+2)<list.length)
				getSumOfFrcation(list[(i*4)],list[((i*4))+1],list[(i*4)+2],list[((i*4))+3]);
		}
		
	}

	private static void getSumOfFrcation(int num1,int den1,int num2, int den2) {
		if(den1==den2)
		{
			System.out.print(num1+num2);
			System.out.print("/"+den1);
			System.out.println();
			return;
		}
		else {
			num1 = num1*den2;
			num2 = num2*den1;
			lowest(num1+num2,den2*den1);
		}
	}

	private static int getGcd(int a, int b) {
		if(a==0)
		return b; 
		return getGcd(b%a,a);
	}
	private static void lowest(int num, int den) {
		int low = getGcd(num,den);
		System.out.print(num/low);
		System.out.print("/"+den/low);
		System.out.println();
	}

}
