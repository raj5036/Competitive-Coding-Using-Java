import java.util.*;

public class Main{
	public static int getSum(int[] a,int n){
		if(n==0)
			return 0;
		return a[n-1]+getSum(a,n-1);
	}
	public static void main(String[] args) {
		int[] a={22324,3243,172,-232};
		int sum=getSum(a,a.length);
		System.out.println(sum);
	}
}