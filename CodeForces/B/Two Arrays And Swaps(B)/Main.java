import java.util.*;

public class Main{
	public static int getSum(int[] temp){
		int sum=0;
		for(int i=0;i<temp.length;i++)
			sum += temp[i];
		return sum;
	}
	public static void swap(int[] a,int[] b,int i){
		int temp=a[i];
		a[i]=b[i];
		b[i]=temp;
	}
	public static int maximumSumOfA(int n,int k,int[] a,int[] b){
		Arrays.sort(a);
		Arrays.sort(b);
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));
		// for(int i=0;i<n;i++){
		// 	if(k>0 && a[i]<b[n-i-1]){
		// 		swap(a,b,i);
		// 		k-=1;
		// 	}
		// }
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));
		// return getSum(a);
		int idx=0;
		int ans=0;
		for(int i=0;i<n;i++){
			if(k>0 && a[i]<b[n-i-1]){
				ans+=b[n-i-1];
			}else{
				idx=i;
				break;
			}
		}
		for(int i=idx;i<n;i++)
			ans+=a[i];
		return ans;
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