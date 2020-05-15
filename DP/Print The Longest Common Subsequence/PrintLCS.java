import java.util.*;
public class PrintLCS{
	   public static List<String> LCS(String X, String Y, int m, int n,
                                int[][] T)
    {
        // if we have reached the end of either sequence
        if (m == 0 || n == 0)
        {
            // create a List with 1 empty string and return
            return new ArrayList<>(Collections.nCopies(1, ""));
        }
 
        // if last character of X and Y matches
        if (X.charAt(m - 1) == Y.charAt(n - 1))
        {
            // ignore last characters of X and Y and find all LCS of
            // substring X[0..m-2], Y[0..n-2] and store it in a List
            List<String> lcs = LCS(X, Y, m - 1, n - 1, T);
 
            // append current character X[m - 1] or Y[n - 1]
            // to all LCS of substring X[0..m-2] and Y[0..n-2]
            for (int i = 0; i < lcs.size(); i++) {
                lcs.set(i, lcs.get(i) + (X.charAt(m - 1)));
            }
 
            return lcs;
        }
 
        // we reach here when the last character of X and Y don't match
 
        // if top cell of current cell has more value than the left cell,
        // then ignore current character of String X and find all LCS of
        // substring X[0..m-2], Y[0..n-1]
        if (T[m - 1][n] > T[m][n - 1])
            return LCS(X, Y, m - 1, n, T);
 
        // if left cell of current cell has more value than the top cell,
        // then ignore current character of String Y and find all LCS of
        // substring X[0..m-1], Y[0..n-2]
        if (T[m][n - 1] > T[m - 1][n])
            return LCS(X, Y, m, n - 1, T);
 
        // if top cell has equal value to the left cell,
        // then consider both character
 
        List<String> top = LCS(X, Y, m - 1, n, T);
        List<String> left = LCS(X, Y, m, n - 1, T);
 
        // merge two Lists and return
        top.addAll(left);
 
        return top;
    }

	public String printLCS(String a,String b,int m,int n,int[][] lookUp){ //This method prints only one LCS
		if(m==0 || n==0)
			return new String();
		if(a.charAt(m-1)==b.charAt(n-1))
			return printLCS(a,b,m-1,n-1,lookUp)+a.charAt(m-1);
		if(lookUp[m-1][n]>lookUp[m][n-1])
			return printLCS(a,b,m-1,n,lookUp);
		else
			return printLCS(a,b,m,n-1,lookUp);
	}
	public void fillLookUpTable(String a,String b,int m,int n,int[][] lookUp){
		//Arrays.fill(lookUp,0);
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(a.charAt(i-1)==b.charAt(j-1))
					lookUp[i][j]=lookUp[i-1][j-1]+1;
				else
					lookUp[i][j]=Integer.max(lookUp[i-1][j],lookUp[i][j-1]);
			}
		}
		// for(int i=0;i<=m;i++){
		// 	for(int j=0;j<=n;j++){
		// 		System.out.print(lookUp[i][j]);
		// 	}
		// 	System.out.println();
		// }
	}
	public static void main(String[] args) {
		PrintLCS obj=new PrintLCS();
		String a="ABABC";
		String b="BABCA";
		int m=a.length();
		int n=b.length();
		int[][] lookUp=new int[m+1][n+1];
		obj.fillLookUpTable(a,b,m,n,lookUp);
		System.out.println(obj.printLCS(a,b,m,n,lookUp));
	}
}