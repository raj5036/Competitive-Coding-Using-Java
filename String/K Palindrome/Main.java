import java.util.*;

public class Main{
	public static boolean kPalindrome(String x,int k){
		String y=new StringBuilder(x).reverse().toString();
		int n=y.length();

		int[][] lookUp=new int[n+1][n+1];

		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(i==0 || j==0)
					lookUp[i][j]=i+j;
				else if(x.charAt(i-1)==y.charAt(j-1))
					lookUp[i][j]=lookUp[i-1][j-1];
				else
					lookUp[i][j]=1+Integer.min(lookUp[i-1][j],lookUp[i][j-1]);
			}
		}
		return (lookUp[n][n]<=2*k);
	}
	public static void main(String[] args) {
		String a="ABCDEAA";
		int k=1;
		Map<String,Integer> map=new HashMap<>();
		System.out.println(kPalindrome(a,k));		
	}
}
// ABM N MBA R
// BCDB +AA //2
// CD + AA+BB //2+2=4
