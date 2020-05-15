import java.util.*;
class Matrix{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int[][] matrix = new int[2][2];
		int[][] trans_matrix=new int[2][2];
		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		matrix[i][j]=sc.nextInt();
		// 	}
		// }
		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		System.out.print(matrix[i][j]);
		// 	}
		// 	System.out.println();
		// }
		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		trans_matrix[i][j]=matrix[j][i];
		// 	}
		// }
		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		System.out.print(trans_matrix[i][j]);
		// 	}
		// 	System.out.println();
		// }
		int[][] grid={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(grid[i][j]);
			}
		}
	}
}