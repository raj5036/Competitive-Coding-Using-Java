import java.util.*;
import java.util.stream.*;
public class EvenArray{
	public static boolean isGoodArray(int[] a,int n){
		for(int i=0;i<n;i++)
			if(i%2!=a[i]%2)
				return false;
		return true;
	}
	public static void swap(int[] a,int i,int j){
		int temp =a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static int isPossible(int[] a,int n,int count){
		if(n==1){
			return isGoodArray(a,n)?0:-1;
		}
		if(isGoodArray(a,n)) 
			return count;
		int firstBreak=-1,fi=-1,secondBreak=-1,si=-1;
		for(int i=0;i<n;i++)
			if(i%2!=a[i]%2){
				firstBreak=a[i];
				fi=i;
			}
		for(int i=0;i<n;i++)
			if(i%2!=a[i]%2 && a[i]!=firstBreak){
				secondBreak=a[i];
				si=i;
			}
		if(secondBreak==-1||firstBreak==-1)
			return -1;
		swap(a,fi,si);
		return isPossible(a,n,count+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println(isPossible(a,n,0));
		}
	}
}