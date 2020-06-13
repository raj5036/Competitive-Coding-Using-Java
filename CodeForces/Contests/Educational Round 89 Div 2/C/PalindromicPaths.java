import java.util.*; 
import java.util.stream.*;

public class PalindromicPaths{
	public static int noOfMinPaths(int[][] matrix,int n,int m){
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		//-------------------------------------------
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[][] matrix=new int[n][m];

			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					matrix[i][j]=sc.nextInt();
				}
			}
			System.out.println(noOfMinPaths(matrix,n,m));
		}
		//------------------------------------------
	}
}