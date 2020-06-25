import java.util.*;
import java.util.stream.*;
public class TroubleSort{
	public static boolean isArraySorted(int[] a,int n){
		for(int i=0;i<n-1;i++)
			if(a[i]>a[i+1])
				return false;
		return true;
	}
	public static void swap(int[] array,int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static boolean isPossible(int[] a,int[] b,int n){
		if(n<=1)
			return true;
		if(isArraySorted(a,n))
			return true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(a[j]>a[j+1] && b[j]!=b[j+1]){
					swap(a,j,j+1);
					swap(b,j,j+1);
					//System.out.println(Arrays.toString(a));
					if(isArraySorted(a,n)) return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int[] a=new int[n];
			int[] b= new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			System.out.println(isPossible(a,b,n)?"Yes":"No");
		}
	}
}