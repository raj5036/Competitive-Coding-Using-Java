import java.util.*;
public class Main{
	String printSCS(String a,String b,int m,int n,int[][] lookUp){
		if(m==0 || n==0)
			return new String();
		if(a.charAt(m-1)==b.charAt(n-1))
			return printSCS(a,b,m-1,n-1,lookUp)+a.charAt(m-1);
		if(lookUp[m-1][n]>lookUp[m][n-1])
			return printSCS(a,b,m-1,n,lookUp);
		else
			return printSCS(a,b,m,n-1,lookUp); 
	}
	void fillLookupTable(String a,String b,int m,int n,int[][] lookUp){
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++)
				if(a.charAt(i-1)==b.charAt(j-1))
					lookUp[i][j]=lookUp[i-1][j-1]+1;
				else
					lookUp[i][j]=Integer.min(lookUp[i-1][j],lookUp[i][j-1]);
	}
	public static void main(String[] args) {
		Main obj=new Main();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			String a="";
			for(int i=1;i<=n;i++){
				int temp=sc.nextInt();
				a+=temp;
			}
			System.out.println("a"+a);
			String b="";
			for(int i=1;i<=m;i++){
				int temp=sc.nextInt();
				b+=temp;
			}
			System.out.println("b"+b);
			int[][] lookUp=new int[m+1][n+1];
			obj.fillLookupTable(a,b,m,n,lookUp);
			String ans=obj.printSCS(a,b,m,n,lookUp);
			if(ans.length()==0)
				System.out.println("NO");
			else{
				System.out.println("YES");
				System.out.println(ans.length());
				for(int i=0;i<ans.length();i++)
					System.out.print(ans.charAt(i)+" ");
			}
		}
	}
}