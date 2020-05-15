import java.util.*;
import java.io.*;
class RotateMatrix{
	void rotateMatrix(int ROW,int COL,int[][] mat){
		int row=0,col=0;
		int prev,cur;
		while(row<ROW && col<COL){
			//Store the first element of the second row in the prev variable
			prev=mat[row+1][col];
			for(int i=col;i<COL;i++){
				cur=mat[row][i];
				mat[row][i]=prev;
				prev=cur;
			}row++;

			for(int i=row;i<ROW;i++){
				cur=mat[i][COL-1];
				mat[i][COL-1]=prev;
				prev=cur;
			}
			 if (row < ROW) 
            { 
                for (int i = COL-1; i >= col; i--) 
                { 
                    cur = mat[ROW-1][i]; 
                    mat[ROW-1][i] = prev; 
                    prev = cur; 
                } 
            } 
           	row--; 
    
            if (col < COL) 
            { 
                for (int i = ROW-1; i >= row; i--) 
                { 
                    cur = mat[i][col]; 
                    mat[i][col] = prev; 
                    prev = cur; 
                } 
            } 
            col++; 
		}
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
		
		RotateMatrix obj=new RotateMatrix();
		obj.printMatrix(ROW,COL,mat);
		obj.rotateMatrix(ROW,COL,mat);

		obj.printMatrix(ROW,COL,mat);
	}
}