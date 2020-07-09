package com.algo.dynamic;

/**
 * Jail break In Bhopal ( Marks)
 * An activist, of a banned organisation, plans to escape from Bhopal jail. The activist is basically a monkey man and is able to jump across the wall. He practises to cross a wall. He is able to jump 'X' meters, but because of the slippery wall he falls 'Y' meters after each jump. To escape from jail, he has to cross 'N' number of walls, where height of each wall is given in an array. 

 * Write a program to find out the total number of jumps he has make, to escape from the Bhopal jail.
 * Input Format
 * Your program  need to take 3 integers from STDIN,  where: 
 * First line contains an integer depicting X
 * Second line contains an integer depicting Y
 * Third line contains an integer depicting N(total number of walls) 
 * Next N lines contain heights of N walls
 *
 */
import java.util.Scanner;
public class JailBreak {

	static int countJumps=0;
	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int jumpSize = reader.nextInt();
		int slipSize = reader.nextInt();
		int arraySize= reader.nextInt();
		int[] array = new int[arraySize];
		for (int i =0;i<array.length;i++)
		{
			array[i] = reader.nextInt();
		}
		for (int i =0;i<array.length;i++)
		{
			if(array[i]<=jumpSize)
			{
				countJumps++;
				break;
			}
			else
			{
				calculateJumsps(array[i], jumpSize, slipSize);	
			}
		}
		System.out.println(countJumps);
		
	}
	static int calculateJumsps(int wallSize,int jumpSize, int slipSize)
	{
		wallSize = wallSize-jumpSize;
		if(wallSize<=0)
			countJumps++;
		else
		{
			countJumps++;
			calculateJumsps(wallSize+1,jumpSize,slipSize);
		}
		return countJumps;
		
	}

}
