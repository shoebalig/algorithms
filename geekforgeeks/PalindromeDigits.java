package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 *
 * `find if some of digits of a number is a palindrome or not eg 56 = 5+6=11 is a palindrome
 *  however 7+8=15 does not form a palindrome
 *  Enter the number of test cases and then input number for each test cases.
 */
public class PalindromeDigits {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>200)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<1||numbers[i]>1000)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(isPalindrome(numbers[i]));
	    }
	}

	private static String isPalindrome(int input) {
		int number = input;
		int sum=0;
		while(number>0)
		{
			sum = sum+number%10;
			number = number/10;
		}
		if(sum%11==0|| (sum/10==0))
			return "YES";
		return "NO";
	}

}
