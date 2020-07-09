package com.algo.backtracking;

public class RateInMaze {
		int N=4;
		private static int count=0;
		public static void main(String args[])
	    {
			
			RateInMaze rat = new RateInMaze();
	        int maze[][] = {{1, 0, 0, 0},
	        				{1, 1, 0, 1},
	        				{1, 1, 0, 0},
	        				{1, 1, 1, 1}
	        							};
	        rat.solveMaze(maze);
	        System.out.println(count);
	    }
		private void solveMaze(int[][] maze) 
		{
			int sol[][] = {{0, 0, 0, 0},
    				{0, 0, 0, 0},
    				{0, 0, 0, 0},
    				{0, 0, 0, 0}
    							};
			if(solveUtil(maze,0,0,sol))
			{
				//count++;
			}
		}
		private boolean solveUtil(int[][] maze, int x, int y, int[][] sol) 
		{
			if(x == N-1 && y == N-1)
			{
				if(isSafe(maze,x,y))
				{
					sol[x][y] = 1;
					count++;
					printSolution(sol);
				}
				return false;
			}
			if(isSafe(maze,x,y))
			{
				sol[x][y] = 1;
				if(solveUtil(maze,x+1,y,sol))
				{
					return true;
				}
				if(solveUtil(maze,x,y+1,sol))
				{
					return true;
				}
				sol[x][y] = 0;
				return false;
			}
			return false;
		}
		
	private boolean isSafe(int[][] maze, int x, int y)
		{
			if(x >= 0 && y >= 0 && x < N && y < N && maze[x][y]==1)
			{
				return true;
			}
			return false;
		}
		void printSolution(int sol[][])
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
