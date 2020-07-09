package geekforgeeks;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if(cases<1||cases>30)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<0||numbers[i]>100)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				System.out.println(isPrime(numbers[i]));
	    }
	}

	private static String isPrime(int input) {
		int number=2;
		String flag = "No";
		while(number<=input)
		{
			if(input%number==0)
			{
				if(input==number)
				{
					flag = "Yes";
					break;
				}
				else
				{
					flag = "No";
					break;
				}
			}
			number++;
		}
		
		return flag;
	}

}
