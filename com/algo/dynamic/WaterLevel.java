package com.algo.dynamic;

public class WaterLevel {
	public static int GetWaterLevel(int input1,int input2,int[] input3)
    {
        //Write code here
        int len=input1;
		int br=input2;
		int A[][]=new int[len][br];
		
		int height[]=new int[input3.length];
		height=input3;
		int count=0;
		int num=0;
		int check=0;
		
		if(len<1 || len>10 || br<1 || br>10)
		{
			return -1;
		}
		for(int i=0;i<height.length;i++)
		{
			if(height[i]<1 || height[i]>10)
			    return -1;
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<br;j++)
			{
				A[i][j]=height[count];
				count++;
			}
		}
		
		

		return check;
    }
	public static void main(String[] args) 
	{
		int arr[]= {3,3,7,3,1,3,
					4,3,1,4,2,6,
					4,1,4,2,4,1};
		int output = GetWaterLevel(3,6,arr);
        System.out.println(String.valueOf(output));
	}
}
