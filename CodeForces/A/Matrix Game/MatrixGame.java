import java.util.*;
import java.util.stream.*;
public class MatrixGame{
	public static boolean isValidClaim(int[][] matrix,int i,int j){
		if(matrix[i][j]==1)
			return false;
		int n=matrix.length;
		int m=matrix[i].length;
		int row=i;
		int col=j;
		for(int index=0;index<m;index++)
			if(matrix[row][index]==1)
				return false;
		for(int index=0;index<n;index++)
			if(matrix[index][col]==1)
				return false;
		return true;
	}
	public static String game(int[][] matrix,int n,int m){
		int noOfClaims=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(matrix[i][j]==0 && isValidClaim(matrix,i,j)){
					matrix[i][j]=1;
					noOfClaims++;
				}
			}
		}
		if(noOfClaims%2==1)
			return "Ashish";
		else 
			return "Vivek";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[][] matrix=new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					matrix[i][j]=sc.nextInt();
			System.out.println(game(matrix,n,m));
		}
	}
}