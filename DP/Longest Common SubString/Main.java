import java.util.*;
public class Main{
	public static String printLCS(String a,String b,int m,int n,int[][] lookUp){
		if(m==0 || n==0)
			return new String();
		if(a.charAt(m-1)==b.charAt(n-1))
			return printLCS(a,b,m-1,n-1,lookUp)+a.charAt(m-1);
		if(lookUp[m-1][n]>lookUp[m][n-1])
			return printLCS(a,b,m-1,n,lookUp);
		else
			return printLCS(a,b,m,n-1,lookUp);

	}
	public static void fillLookUpTable(String a,String b,int m,int n,int[][] lookUp){
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(a.charAt(i-1)==b.charAt(j-1))
					lookUp[i][j]=lookUp[i-1][j-1]+1;
				else
					lookUp[i][j]=Integer.max(lookUp[i-1][j],lookUp[i][j-1]);
			}
		}
	}
	public static void main(String[] args) {
		String a="ABABAB";
		String b="MNABABMN";
		int m=a.length();
		int n=b.length();
		int[][] lookUp=new int[m+1][n+1];
		System.out.print(printLCS(a,b,m,n,lookUp));
	}
}