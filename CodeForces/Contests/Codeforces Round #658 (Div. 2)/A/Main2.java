import java.util.*;
public class Main2{
	void function(int[] a,int[] b,int n,int m){
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(a[i]==b[j]){
					System.out.println("YES");
					System.out.println(1);
					System.out.println(a[i]);
					return;
				}
		System.out.println("NO");
	}
	public static void main(String[] args) {
		Main2 obj=new Main2();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] a=new int[n];
			int[] b=new int[m];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<m;i++)
				b[i]=sc.nextInt();

			obj.function(a,b,n,m);
		}
	}
}