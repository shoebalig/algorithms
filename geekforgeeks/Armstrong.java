package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 *
 * `Armstrong number since 33 + 73 + 13 = 371,Yes or No
 * Enter the number of test cases and then input number for each test cases.
 */
public class Armstrong {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>31)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<100||numbers[i]>1000)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(isArmstrong(numbers[i]));
	    }
	}

	private static String isArmstrong(int input) 
	{
		int sum=0;
		int number= input;
		while(number>0)
		{
			sum= sum+(number%10)*(number%10)*(number%10);
			number = number/10;
		}
		if(sum==input)
			return "Yes";
		return "No";
	}

}
