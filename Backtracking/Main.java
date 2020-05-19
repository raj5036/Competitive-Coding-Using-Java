import java.util.*;

class KnightsTour{
	private static int N=8;
	private static final int row[] = { 2, 1, -1, -2, -2, -1,  1,  2 , 2 };
	private static final int col[] = { 1, 2,  2,  1, -1, -2, -2, -1, 1 };

	public boolean isValid(int x,int y){
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;

		return true;
	}
	public void print(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void knightsTour(int[][] visited,int x,int y,int pos){
		visited[x][y]=pos;
		if(pos>=N*N){
			print(visited);
			visited[x][y]=0;
			return;
		}

		for(int k=0;k<N;k++){
			int newX=x+row[k];
			int newY=y+col[k];
			if(isValid(newX,newY) && visited[newX][newY]==0)
				knightsTour(visited,newX,newY,pos+1);
		}
		visited[x][y]=0;
	}
	public static void main(String[] args) {
		int[][] visited=new int[N][N];
		int pos=1;
		KnightsTour obj=new KnightsTour();
		obj.knightsTour(visited,0,0,pos);
	}
}