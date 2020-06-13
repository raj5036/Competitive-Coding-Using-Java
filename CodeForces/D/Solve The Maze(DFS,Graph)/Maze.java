import java.util.*;
import java.util.stream.*;

public class Maze{
	public static boolean isSafe(char[][] maze,int i,int j){
		int n=maze.length;
		int m=maze[0].length;
		return (i>=0 && j>=0 && maze[i][j]=='.' && i<m && j<n);
	}
	public static boolean checkForG(char[][] maze){
		for(int i=0;i<maze.length;i++)
			for(int j=0;j<maze[i].length;j++)
				if(maze[i][j]=='G')
					return true;
		return false;
	}
	public static boolean solveMazeUtil(char[][] maze,int i,int j){
		if(i==n-1 && j==m-1) return true;

		if(isSafe(maze,i,j)){
			if(isSafe(maze,i-1,j))   //up
				return solveMazeUtil(maze,i-1,j);
			if(isSafe(maze,i+1,j))  //down
				return solveMazeUtil(maze,i+1,j);
			if(isSafe(maze,i,j-1))  //left
				return solveMazeUtil(maze,i,j-1);
			if(isSafe(maze,i,j+1))  //right
				return solveMazeUtil(maze,i,j+1);
			return false;
		}
		return false;
	}
	public static boolean solveMaze(char[][] maze){
		if(!checkForG(maze))
			return true;

		int startingRow=-1,startingColumn=-1;
		for(int i=0;i<maze.length;i++)
			for(int j=0;j<maze[i].length;j++)
				if(maze[i][j]=='G'){
					startingRow=i;
					startingColumn=j;
				}

		return solveMazeUtil(maze,startingRow,startingColumn);
	}
	public static boolean isPossible(char[][] maze){
		if(!checkForG(maze))
			 return true;
		
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			char[] maze=new char[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					maze[i][j]=sc.next().charAt(0);
			System.out.println((isPossible(maze) ? "Yes":'No'));
		}
	}
}