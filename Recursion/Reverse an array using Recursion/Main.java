import java.util.*;

public class Main{
	public static void getReverse(int[] a,int n,int[] ans,int index){
		if(n==0)
			return;
		ans[index]=a[n-1];
		getReverse(a,n-1,ans,index+1);
	}
	public static void getReverse(int[] a,int n,int index){
		if(n==0)
			return;
		if(index>n)
			return;

		int temp=a[index];
		a[index]=a[n-1];
		a[n-1]=temp;

		getReverse(a,n-1,index+1);
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,34,12};
		int[] ans=new int[a.length];
		//getReverse(a,a.length,ans,0);
		getReverse(a,a.length,0);
		for(int i=0;i<ans.length;i++)
			System.out.print(a[i]+" ");
	}
}