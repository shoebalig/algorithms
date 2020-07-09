package com.algo.backtracking;

public class NNQueenProblem {

	private static int N;
	public static void main(String[] args) 
	{
		int chessBoard[][]= {
							{1,0,0,0},
							{1,1,0,0},
							{1,1,0,0},
							{1,1,1,1}
			
		};
		int sol[][]= {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}

		};
		N=sol.length;
		if(solveMaze(chessBoard,0,0,sol))
		{
			System.out.println("Solution reached");
		}
	}
	
	private static boolean solveMaze(int[][] maze, int row, int col, int[][] sol) 
	{
		if(row == N-1 && col == N-1)
		{
			if(isSafeMaze(maze,row,col))
			{
				sol[row][col]=1;
				printSolution(sol);
			}
			return false;
		}
		if(isSafeMaze(maze,row,col))
		{
			sol[row][col]=1;
			if(solveMaze(maze,row+1,col,sol))
			{
				return true;
			}
			if(solveMaze(maze,row,col+1,sol))
			{
				return true;
			}
			sol[row][col]=0;
			return false;
		}
		return false;
	}

	private static boolean isSafeMaze(int[][] maze, int row, int col) 
	{
		if(row>=0 && col>=0 && row<N && col<N)
		{
			if(maze[row][col]==1)
				return true;
		}
		return false;
	}

	static boolean isSafe(int chessBoard[][],int row,int col)
	{
		//this row left side
		if(row>=0 && col>=0 && col<=N-1 && col<=N-1)
		{
			for (int i = col; i >=0 ; i--) 
			{
				if(chessBoard[row][i] == 1)
				{
					return false;
				}
			}
			/* Check upper diagonal on left side */
			for (int i=row, j=col; i>=0 && j>=0; i--, j--)
	            if (chessBoard[i][j] == 1)
	                return false;
	 
	        /* Check lower diagonal on left side */
	        for (int i=row, j=col; j>=0 && i<N; i++, j--)
	            if (chessBoard[i][j] == 1)
	                return false;
		}
		return true;
	}
	static void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + sol[i][j] +
                                 " ");
            System.out.println();
        }
    }
}
