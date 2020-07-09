package com.algo.dynamic;

import java.util.*;

public class Land_Distribution {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int parkingSpace = reader.nextInt();
		if (parkingSpace > 100 || parkingSpace < 1)
			return;
		int rows = reader.nextInt();
		int columns = reader.nextInt();
		if (columns % 2 ==0)
			return;
		int[][] points = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				points[i][j] = reader.nextInt();
			}
		}
		reader.close();
		System.out.println(resolveconflict(rows, points));
	}

	private static int resolveconflict(int rows, int[][] points) {
		int cost[] = new int[points.length];
		List<Integer[]> coordinateList = new ArrayList<>(rows);
		String coordinates = "";

		/**
		 * fetch cost of each row/level fetch last column each row
		 */
		for (int i = 0; i < cost.length; i++) {
			cost[i] = points[i][points[i].length - 1];
		}

		/**
		 * fetch coordinated of each level read initial and last coordinate and find all
		 * , fall in between. and Add each to a list.
		 */
		Integer[] cord;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < points[i].length - 1; j++) {
				coordinates = coordinates + points[i][j];
			}

			cord = getAllPoints(coordinates, rows * (points[i].length - 1));
			coordinateList.add(cord);
			coordinates = "";
		}
		int commonPark = interseectionAll(coordinateList);
		int compansation = getFinalCompansate(coordinateList, cost, commonPark);
		return compansation;
	}

	private static int getFinalCompansate(List<Integer[]> coordinateList, int[] costValue, int commonPark) 
	{
		int finalValue=0;
		for (int i = 0; i < coordinateList.size(); i++) {
			Integer row[] = coordinateList.get(i);
			int count = getTotalOverLap(row,coordinateList,i);
			finalValue = finalValue + (count-commonPark)*costValue[i];
		}
		return finalValue;
	}

	private static int getTotalOverLap(Integer[] row, List<Integer[]> allRows, int currentRow) 
	{
		int intersection = 0;
		
		for (int i = 0; i < allRows.size(); i++) 
		{
			HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(row));
			if(i != currentRow)
			{
				HashSet<Integer> set = new HashSet<>(Arrays.asList(allRows.get(i)));
				intersectionSet.retainAll(set);
				intersection = intersection +intersectionSet.size();
			}
		}
		return intersection;
	}

	static int interseectionAll(List<Integer[]> coordinateList) 
	{
		for (Integer[] inputArray : coordinateList) {
		}

		HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(coordinateList.get(0)));

		for (int i = 1; i < coordinateList.size(); i++) {
			HashSet<Integer> set = new HashSet<>(Arrays.asList(coordinateList.get(i)));

			intersectionSet.retainAll(set);
		}
		return intersectionSet.size();
	}

	private static Integer[] getAllPoints(String coordinates, int size) {
		char[] chars = coordinates.toCharArray();
		int x1 = Integer.parseInt("" + chars[0]);
		int y1 = Integer.parseInt("" + chars[1]);
		int x2 = Integer.parseInt("" + chars[2]);
		int y2 = Integer.parseInt("" + chars[3]);
		coordinates = "";
		int count = 0;
		Integer[] cord = new Integer[size];
		for (int i = x1, j = y1; i <= x2 && j <= y2;) {
			coordinates = coordinates + i + "" + j + ",";
			cord[count] = Integer.parseInt(i + "" + j);
			count++;
			if (i == x2) {
				i = x1;
				j++;
			} else
				i++;
		}
		return cord;
	}
}
