package geekforgeeks;

import java.util.Scanner;

public class PrintNumbersWithoutLoop {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
		if(cases<1||cases>100)
			return;
		int []numbers = new int[cases];
		for(int i=0;i<numbers.length;i++)
	    {
				numbers[i] = reader.nextInt();
				if(numbers[i]<1||numbers[i]>990)
					return;
	    }
		for(int i=0;i<numbers.length;i++)
	    {
				printNumber(numbers[i],1);
				System.out.println();
	    }
	}

	private static void printNumber(int input, int count) {

		if(count>input)
			return;
		System.out.print(count+" ");
		printNumber(input,++count);
	}

}
