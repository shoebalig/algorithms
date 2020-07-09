package com.algo.dynamic;
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
        boolean printDebugInfo = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (printDebugInfo)
            System.out.println("Input 1: " + Integer.parseInt(input));
        input = reader.readLine();
        if (printDebugInfo)
            System.out.println("Input 2: " + Integer.parseInt(input));
        int numrows = Integer.parseInt(input);
        input = reader.readLine();
        if (printDebugInfo)
            System.out.println("Input 3: " + Integer.parseInt(input));
        if (printDebugInfo)
            System.out.println();
        int numcols = Integer.parseInt(input);
        int narr[][] = new int[numrows][numcols];
        for (int i = 0; i < numrows; i++)
        {
            input = reader.readLine();
            if (printDebugInfo)
            System.out.println("Read Row " + (i + 1) + ": " + input);
            String [] arr = input.split(" ");
            if (printDebugInfo)
                System.out.println();
            for (int j = 0; j < arr.length; j++)
            {
                if (printDebugInfo)
                    System.out.print(" " + arr[j]);
                narr[i][j] = Integer.parseInt(arr[j]);
            }
            if (printDebugInfo)
                System.out.println();
        }
        if (printDebugInfo)
            System.out.println();
        int maxX2 = 1;
        int maxY2 = 1;
        if (printDebugInfo)
            System.out.println("Following is the input array to be processed");
        for (int i = 0; i < numrows; i++)
        {
            if (printDebugInfo)
                System.out.println();
            for (int j = 0; j < numcols; j++)
            {
                if (printDebugInfo)
                    System.out.print(" " + narr[i][j]);
            }
            if (maxX2 < narr[i][2]) maxX2 = narr[i][2];
            if (maxY2 < narr[i][3]) maxY2 = narr[i][3];
        }
        if (printDebugInfo)
            System.out.println();
        if (printDebugInfo)
            System.out.println("maxX2: " + maxX2);
        if (printDebugInfo)
            System.out.println("maxY2: " + maxY2);
        int overlaps[][] = new int[maxX2][maxY2];
        
        for (int i = 0; i < numrows; i++)
        {
            for (int j = narr[i][1] - 1; j < narr[i][3]; j++)
            {
                for (int k = narr[i][0] - 1; k < narr[i][2]; k++)
                {
                    overlaps[j][k]++;
                }
            }
        }
       
        for (int i = 0; i < maxX2; i++)
        {
            if (printDebugInfo)
                System.out.println();
            for (int j = 0; j < maxY2; j++)
            {
                if (printDebugInfo)
                    System.out.print(" " + overlaps[i][j]);
            }
        }
        if (printDebugInfo)
            System.out.println();
        
        int totalRefund = 0;
        for (int i = 0; i < numrows; i++)
        {
        	int overlappedBlocks = 0;
        	int cost = narr[i][4];
        	
            for (int j = narr[i][1] - 1; j < narr[i][3]; j++)
            {
                for (int k = narr[i][0] - 1; k < narr[i][2]; k++)
                {
                	if (overlaps[j][k] > 1)
                	{
                		overlappedBlocks++;
                	}
                }
            }
            totalRefund += (overlappedBlocks * cost);
        }
        System.out.println(totalRefund);
   }
}