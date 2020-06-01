import java.util.*;
public class Main{
	public static int getDifference(int n,int[] a){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int difference=Math.abs(a[i]-a[j]);
				if(difference<min)
					min=difference;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		for(int index=0;index<temp;index++){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println(getDifference(n,a));
		}
	}
}