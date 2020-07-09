package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 *
 * `Enter binary number in form of 0's and 1's eg 11000100, and print the equivalent decimal number
 * eg:- for  11000100 the decimal equivalent is 196., 
 * Enter number of test cases and then input number you want to convert.
 */
public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		long []numbers = new long[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextLong();
				if(Long.toString(numbers[i]).length()<1||Long.toString(numbers[i]).length()>16)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(connvertToDecimal(Long.toString(numbers[i])));
	    }
	}

	private static int connvertToDecimal(String input) {

		int multiplier = 1;
		int sum=0;
		for (int i = 0; i < input.length(); i++) 
		{
			int num = Integer.parseInt(""+input.charAt((input.length()-1)-i));
			if(num==1)
			{
				sum = sum+num*multiplier;
			}
			multiplier=multiplier*2;
		}
		return sum;
	}

}
