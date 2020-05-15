import java.util.*;
import java.io.*;
public class LCSLength{
	public int findLengthOfLongestLCS(String a,String b,int m,int n){
		///base case
		if(m==0 || n==0)
			return 0;
		if(a.charAt(m-1)==b.charAt(n-1))
			return findLengthOfLongestLCS(a,b,m-1,n-1)+1;
		else
			return Integer.max(findLengthOfLongestLCS(a,b,m-1,n),findLengthOfLongestLCS(a,b,m,n-1));
	}
	public int findLengthOfLongestLCS(String a,String b,int m,int n,Map<String,Integer> lookupTable){
		if(m==0 || n==0)
			 return 0;
		String key=m+"|"+n;
		if(!lookupTable.containsKey(key)){
			if(a.charAt(m-1)==b.charAt(n-1))
					lookupTable.put(key,(findLengthOfLongestLCS(a,b,m-1,n-1,lookupTable)+1));
		}
		else{
			lookupTable.put(key,Integer.max(findLengthOfLongestLCS(a,b,m-1,n,lookupTable),
											findLengthOfLongestLCS(a,b,m,n-1,lookupTable)
											)
			);
		}
		return lookupTable.get(key);
	}
	public int findLengthOfLongestLCSUsing2DArray(String X,String Y){
		int m = X.length(), n = Y.length();
		int[][] T = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				else {
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
				}
			}
		}

		return T[m][n];
	}
	public static void main(String[] args) {
		LCSLength obj=new LCSLength();
		String a="XMJYAUZ";
		String b="MZJAWXU";
		int m=a.length();
		int n=b.length();
		//System.out.println(obj.findLengthOfLongestLCS(a,b,m,n));
		Map<String,Integer> lookupTable=new HashMap<String,Integer>();
		//System.out.println(obj.findLengthOfLongestLCS(a,b,m,n,lookupTable));
		System.out.println(obj.findLengthOfLongestLCSUsing2DArray(a,b));
	}
}