import java.util.*;
import java.io.*;
class Rat{
	public Boolean isSafe(int[][] maze,int x,int y,int N){
		return (maze[x][y]==1 &&(x>=0 && x<N) && (y>=0 && y<N));
	}
	public Boolean solveMazeUtil(int[][] maze,int x,int y,int[][] sol){
		int N=maze.length;
		sol[x][y]=1;
		if(x==N-1 && y==N-1){
			sol[x][y]=1;
			return true;
		}
		if (isSafe(maze, x, y,N) == true) { 
			 
			sol[x][y] = 1; 

			
			if (solveMazeUtil(maze, x + 1, y, sol)) 
				return true; 
			if (solveMazeUtil(maze, x, y + 1, sol)) 
				return true; 

			sol[x][y] = 0; 
			return false; 
		}
		return false;

	}
	static void printSolution(int[][] sol){
		for(int i=0;i<sol.length;i++){
			for(int j=0;j<sol.length;j++){
				System.out.print(sol[i][j]);
			}
			System.out.println();
		}
	}
	public void solveMaze(int[][] maze,int N){
		int[][] sol=new int[N][N];
		if(!solveMazeUtil(maze,0,0,sol)){
			System.out.println("Solution doesn't exist");
		}else{
			printSolution(sol);
		}

	}
	public static void main(String[] args) {
		Rat path=new Rat();
		int maze[][] = { { 1, 0, 0, 0 }, 
						{ 1, 1, 0, 1 }, 
						{ 0, 1, 0, 0 }, 
						{ 1, 1, 1, 1 } 
					};
		int N=maze.length;
		path.solveMaze(maze,N);
	}
}
/*
	1 0 0 0 
	1 1 0 0
	0 1 0 0
	0 1 1 1
*/