import java.util.*;

public class Main{
	public static int getSum(int[] temp){
		int sum=0;
		for(int i=0;i<temp.length;i++)
			sum += temp[i];
		return sum;
	}
	public static void swap(int a,int b){
		int temp=a;
		a=b;
		temp=b;
	}
	public static int maximumSumOfA(int n,int k,int[] a,int[] b){
		Arrays.sort(a);
		Arrays.sort(b);

		int m=n-1;
		for(int i=0,j=m;i<n;i++,j--){
			if(k==0)
				return getSum(a);
			if(a[i]<b[j]){
				swap(a[i],b[m]);
				k=-1;
			}
		}
		return getSum(a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();

		for(int id=0;id<testCase;id++){
			int n=sc.nextInt();
			int k=sc.nextInt();

			int[] a=new int[n];
			int[] b=new int[n];

			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();

			int count=1;
			for(int i=0;i<n;i++){
				if(a[i]>b[i])
					count++;
			}
			if(count==n || k==0)
				System.out.println(getSum(a));
			else
				System.out.println(maximumSumOfA(n,k,a,b));
		}
	}
}