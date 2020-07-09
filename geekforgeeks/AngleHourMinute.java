package geekforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculate the angle between hour hand and minute hand.

There can be two angles between hands, we need to print minimum of two. Also, 
we need to print floor of final result angle. For example, if the final angle is 10.61, we need to print 10.

 

Input:

The first line of input contains a single integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of one line conatining two space 
separated numbers h and m where h is hour and m is minute.

Output:
Coresponding to each test case, print the angle b/w hour and min hand in a separate line.

Constraints:

1 ≤ T ≤ 100
1 ≤ h ≤ 12
1 ≤ m ≤ 60

Example:

Input
2
9 60
3 30

Output
90
75
 * @author shoekhan
 *
 */
public class AngleHourMinute {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int cases = Integer.parseInt(br.readLine()); 
		if(cases<1||cases>100)
			return;
		for(int i=0;i<cases;i++)
	    {
			String[] numbers = br.readLine().trim().split(" ");
			double hours = Double.parseDouble(numbers[0]);
			double minutes = Double.parseDouble(numbers[1]);
				if(hours<1||hours>12||minutes<0||minutes>60)
					return;
				calculateAngle(hours,minutes);
	    }
		br.close();
}

	private static void calculateAngle(double h, double m) 
	{
		if (h == 12) 
            h = 0; 
        if (m == 60)  
            m = 0; 
  
        // Calculate the angles moved by hour and minute hands 
        // with reference to 12:00 
        double hour_angle = (0.5 * (h*60 + m)); 
        double minute_angle = (6*m); 
  
        // Find the difference between two angles 
        double angle = Math.abs(hour_angle - minute_angle); 
  
        // smaller angle of two possible angles 
        angle = Math.min(360-angle, angle); 
  
         System.out.println((int)Math.floor(angle));
	}
}
