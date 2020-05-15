import java.util.*;
class PrintLCSNew{
	List<String> printAllLCS(String a,String b,int m,int n,int[][] lookUpTable){
		if(m==0 || n==0)
			return new ArrayList<>(Collections.nCopies(1,""));
		else if(a.charAt(m-1)==b.charAt(n-1)){
			List<String> lcs=printAllLCS(a,b,m-1,n-1,lookUpTable);
			for(int i=0;i<lcs.size();i++)
				lcs.set(i,lcs.get(i)+a.charAt(m-1));
			return lcs;
		}
		if(lookUpTable[m-1][n]>lookUpTable[m][n-1])
			return printAllLCS(a,b,m-1,n,lookUpTable);
		else if(lookUpTable[m][n-1]>lookUpTable[m-1][n])
			return printAllLCS(a,b,m,n-1,lookUpTable);

		List<String> top=printAllLCS(a,b,m-1,n,lookUpTable);
		List<String> left=printAllLCS(a,b,m,n-1,lookUpTable);

		top.addAll(left);

		return top;

	}
	String printLCS(String a,String b,int m,int n,int[][] lookUpTable){
		if(m==0 || n==0)
			return new String();
		else if(a.charAt(m-1)==b.charAt(n-1))
			return printLCS(a,b,m-1,n-1,lookUpTable)+a.charAt(m-1);
		else{
			if(lookUpTable[m-1][n]>lookUpTable[m][n-1])
				return printLCS(a,b,m-1,n,lookUpTable);
			else
				return printLCS(a,b,m,n-1,lookUpTable);
		}
	}
	void fillLookUpTable(String a,String b,int m,int n,int[][] lookUpTable){
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(a.charAt(i-1)==b.charAt(j-1))
					lookUpTable[i][j]=lookUpTable[i-1][j-1]+1;
				else
					lookUpTable[i][j]=Integer.max(lookUpTable[i-1][j],lookUpTable[i][j-1]);
			}
		}
	}
	public static void main(String[] args) {
		PrintLCSNew obj=new PrintLCSNew();
		String a="abcdpqt";
		String b="pmnacq";
		int[][] lookUpTable=new int[a.length()+1][b.length()+1];
		//Arrays.fill(lookUpTable,0);
		obj.fillLookUpTable(a,b,a.length(),b.length(),lookUpTable);
		System.out.println(obj.printLCS(a,b,a.length(),b.length(),lookUpTable));

		System.out.println(obj.printAllLCS(a,b,a.length(),b.length(),lookUpTable));
	}
}