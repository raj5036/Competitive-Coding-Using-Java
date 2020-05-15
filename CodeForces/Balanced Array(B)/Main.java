import java.util.*;
public class Main{
	public static void getTheArray(int[] a,int n){
		if((n/2)%2!=0){
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		int[] val={2,4,1,5};
		for(int i=0,j=n/2;i<n/2;i++,j++){
			a[i++]=val[0];
			a[i]=val[1];
			a[j++]=val[2];
			a[j]=val[3];

			for(int id=0;id<4;id++)
				val[id]+=6;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int n=sc.nextInt();
			int[] a=new int[n];
			getTheArray(a,n);
		}
	}
}
/*
	n=4;
	2 18 11 9
*/