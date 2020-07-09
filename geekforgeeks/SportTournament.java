package geekforgeeks;

import java.util.Scanner;

/**
 * Sports Tournament (50 Marks) The company XYZ is hosting a cricket tournament
 * for its employees. The teams are to be built by different departments and the
 * format of the tournament will be knockout. The HR lead is busy with
 * preparations and has done all the promotions. The sponsors are very keen for
 * the tournament and have raised queries about it. The sponsors have asked
 * about the number of matches that needs to be played. Here is where the HR
 * executive is unable to help as he made all the preparations but forgot about
 * the basic questions. He badly needs your help to find the number of matches
 * they have to organize.
 * 
 * 
 * 
 * 
 * 
 * The HR has provided you with the total number of teams(N) that registered for
 * the tournament. If there is any team left out to be paired then it
 * automatically gets promoted to the next round. Now it is only you who can
 * save the HR from embarrassment by solving the problem.
 * 
 * 
 * 
 * Input Format The first line of input consist of the number of test cases T.
 * 
 * Next T lines consist of the number of teams participating in the tournament,
 * N.
 * 
 * 
 * 
 * Constraints 1<= T <=100
 * 
 * 2<= N <=100000
 * 
 * 
 * 
 * Output Format For each test case, print the number of matches that have to be
 * played.
 * 
 * Sample TestCase 1 Input 2 4 7 Output 3 6 Explanation Test Case 1: N = 4 = 2 +
 * 1 = 3
 * 
 * Test Case 2: N = 7 = 3 + 2 + 1 = 6
 * 
 * @author shoekhan
 *
 */
public class SportTournament {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		if (cases < 1 || cases > 100)
			return;
		int[] numbers = new int[cases];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = reader.nextInt();
			if (numbers[i] < 2 || numbers[i] > 100000)
				return;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(calculateMatches(numbers[i], 0));
		}
	}

	private static int calculateMatches(int teams, int counter) 
	{
		if(teams<=1)
		{
			return counter;
		}

		int rem =teams%2; 
		teams = teams/2; 
		counter=counter+teams;
		return calculateMatches(teams+rem,counter);
	}
}
