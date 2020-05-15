import java.util.*;
import java.io.*;
class DiagonalDiff{
	int getDifference(int ROW,int COL,int[][] mat){
		int row=0,col=0;
		int sum1=0;
		int sum2=0;
		for (int i=0;i<ROW;i++) {
			sum1 += mat[i][i];
			sum2 += mat[i][ROW-i-1];
		}
		
		return Math.abs(sum1-sum2);
	}
	void printMatrix(int ROW,int COL,int[][] mat){
		System.out.println("The matrix is : ");
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ROW=sc.nextInt();
		int COL=sc.nextInt();
		int[][] mat=new int[ROW][COL];
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		
		DiagonalDiff obj=new DiagonalDiff();
		obj.printMatrix(ROW,COL,mat);
		System.out.println("The difference of sums of two diagonals are : ");
		System.out.println(obj.getDifference(ROW,COL,mat));		
	}
}