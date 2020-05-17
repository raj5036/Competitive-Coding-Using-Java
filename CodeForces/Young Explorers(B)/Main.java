import java.util.*;

public class Main{
	public static int noOfGroups(int[] e,int n){//4 4 4 5 1
		int groups=0;
		for(int i=0;i<e.length;i++){
			if(e[i]==n)
				return 1;
		}
		for(int i=0;i<e.length;i++){
			if(e[i]==1)
				groups++;
		}
		return groups;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int[] e=new int[n];
			for(int j=0;j<n;j++){
				e[j]=sc.nextInt();
			}
			System.out.println(noOfGroups(e,n));
		}
	}
}