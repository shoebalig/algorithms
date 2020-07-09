package geekforgeeks;

import java.util.Scanner;
/**
 * 
 * @author shoekhan
 *
 * `Arithmatic progression
 * Enter the number of test cases and then 2 input numbers(first and second of the seriese) for each test cases.
 */
public class SeriesAP {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int cases = reader.nextInt();
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
				System.out.println(getNthTerm(list[(i*3)],(list[((i*3))+1]-list[(i*3)]),list[((i*3))+2]));
		}
		
	}
	static int getNthTerm(int start ,int diff,int position)
	{
		return  (start+((position-1)*diff));
		
	}

}
