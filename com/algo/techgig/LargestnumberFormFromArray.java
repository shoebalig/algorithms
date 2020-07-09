package pack;

import java.util.Arrays;
import java.util.Comparator;

public class LargestnumberFormFromArray {

	public static void main(String[] args) {
		Integer arr[]= {8,3,4,32};  //84332
		//{8,3,4,34} //84343 
		formLargest(arr);
	}

	private static void formLargest(Integer[] arr) 
	{
		Arrays.sort(arr, new Comparator<Integer>() {


			@Override
			public int compare(Integer o1, Integer o2) {
				String XY = o1+""+o2;
				String YX = o2+""+o1;
				return XY.compareTo(YX);
			}
		});
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[arr.length-1-i]);
		}
	}

}
