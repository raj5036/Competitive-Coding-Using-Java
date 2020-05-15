import java.util.*;

public class Main{
	public static int findLRS(String s,int m,int n){
		if(m==0 || n==0)
			return 0;
		if(s.charAt(m-1)==s.charAt(n-1) && m!=n)
			return findLRS(s,m-1,n-1)+1;
		else
			return Integer.max(findLRS(s,m,n-1),findLRS(s,m-1,n));
	}
	public static int findLRSMem(String s,int n,int[][] LookUp){

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(s.charAt(i-1)==s.charAt(j-1) && i-1!=j-1)
					LookUp[i][j]=LookUp[i-1][j-1]+1;
				else
					LookUp[i][j]=Integer.max(LookUp[i-1][j],LookUp[i][j-1]);
			}
		}
		return LookUp[n][n];
	}
	public static void main(String[] args) {
		String s="ATACTCGGA";
		int n=findLRS(s,s.length(),s.length());
		System.out.println(n);
		int[][] LookUp=new int[s.length()+1][s.length()+1];
		System.out.println(findLRSMem(s,s.length(),LookUp));
	}
}