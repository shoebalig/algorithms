package geekforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfYear {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int cases = Integer.parseInt(br.readLine()); 
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		if(cases<1||cases>100)
			return;
		for(int i=0;i<cases;i++)
	    {
			String[] numbers = br.readLine().trim().split(" ");
			int day = Integer.parseInt(numbers[0]);
			int month = Integer.parseInt(numbers[1]);
			int year = Integer.parseInt(numbers[2]);
			if(year<1990 ||year>2100)
				return;
			System.out.println(days[dayofweek(day,month,year)]);
	    }
		br.close();
}
	static int dayofweek(int d, int m, int y) 
	{ 
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    int day=( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
	    return day; 
	} 
}
