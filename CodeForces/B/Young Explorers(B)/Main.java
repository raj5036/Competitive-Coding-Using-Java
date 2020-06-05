import java.util.*;

public class Main{
	public static int noOfGroups(int[] e,int n){//1 2 2 2 3 4 4 // 2 4 1 3  
		int groups=0;
		Arrays.sort(e);
		for(int i=0;i<n; ){
			int x=1;
			while(x<e[i] && i<n-1){
				i++;
				x++;
			}
			if(x>=e[i])
				groups++;
			i++;
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