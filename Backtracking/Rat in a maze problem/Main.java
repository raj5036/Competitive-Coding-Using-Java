import java.util.*;

public class Main{
	public static void printSolution(int[][] solution){
		for(int i=0;i<solution.length;i++){
			for(int j=0;j<solution.length;j++){
				System.out.print(solution[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean isSafe(int i,int j,int[][] maze){
		return maze[i][j]==1 && i<=maze.length && j<=maze.length;
	}
	public static boolean solveMazeUtil(int[][] maze,int[][] solution,int i,int j){
		if(maze[0][0]==0)
			return false;
		if(i==maze.length-1 && j==maze.length-1){
			solution[i][j]=1;
			return true;
		}

		if(isSafe(i,j,maze)){
			solution[i][j]=1;

			if(isSafe(i,j+1,maze))
				return solveMazeUtil(maze,solution,i,j+1);
			if(isSafe(i+1,j,maze))
				return solveMazeUtil(maze,solution,i+1,j);
			return false;
		}
		return false;
	}
	public static void solveMaze(int[][] maze){
		int[][] solution=new int[maze.length][maze.length];

		int i=0,j=0;

		if(solveMazeUtil(maze,solution,i,j)){
			System.out.println("Possible");
			printSolution(solution);
		}
		else
			System.out.println("Not Possible");		
		
	}

	public static void main(String[] args) {
		int[][] maze={
			{1,0,0,1},
			{1,1,0,0},
			{0,1,0,1},
			{0,1,1,1}
		};
		solveMaze(maze);	
	}
}