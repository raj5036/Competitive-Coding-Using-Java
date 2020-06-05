import java.util.*;
public class Main{
	public static boolean isValid(int[][] matrix,int i,int j){
		if(matrix[i][j]==1 && matrix[i+1][j]==0 && matrix[i][j+1]==0)
			return false;
		return true;
	}
	public static boolean didTrainingHappen(int[][] matrix,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=n-1 && j!=n-1)
					if(isValid(matrix,i,j)==false)
						return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int[][] matrix=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=sc.nextInt();
				}
			}
			if(didTrainingHappen(matrix,n))
						System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}

