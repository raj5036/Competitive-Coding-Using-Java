import java.util.*;
import java.util.stream.*;

public class FloodFill{
	public static void recurse(int[][] screen,int i,int j){
		if(i<0 || i>=screen.length || j<0 || j>=screen[i].length || screen[i][j]!=2)
			return;
		screen[i][j]=3;
		recurse(screen,i-1,j); //Up
		recurse(screen,i+1,j); //Down
		recurse(screen,i,j-1); //Left
		recurse(screen,i,j+1); //Right
	}
	public static void main(String[] args) {
		int[][] screen = {  
							  {1, 1, 1, 1, 1, 1, 1, 1},
		                      {1, 1, 1, 1, 1, 1, 0, 0},
		                      {1, 0, 0, 1, 1, 0, 1, 1},
		                      {1, 2, 2, 2, 2, 0, 1, 0},
		                      {1, 1, 1, 2, 2, 0, 1, 0},
		                      {1, 1, 1, 2, 2, 2, 2, 0},
		                      {1, 1, 1, 1, 1, 2, 1, 1},
		                      {1, 1, 1, 1, 1, 2, 2, 1},
		                  };
      	for(int i=0;i<screen.length;i++)
      		for(int j=0;j<screen[i].length;j++)
      			if(screen[i][j]==2){
      				recurse(screen,i,j);
      			}

		for(int i=0;i<screen.length;i++){
      		for(int j=0;j<screen[i].length;j++){
      			System.out.print(screen[i][j]+" ");
      		}
      		System.out.println();
      	}

	}
}