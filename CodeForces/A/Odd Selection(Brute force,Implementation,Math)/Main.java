import java.util.*;
public class Main{
	public static boolean isPossible(int[] a,int n,int x){
		//Check for x==1;
		if(x<=1)
			for(int i=0;i<n;i++)
				if(a[i]%2==1) return true;
		//Else 
		int countOfEven=0,countOfOdd=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0) countOfEven++; //1
			else countOfOdd++; //2
		}
		if(countOfOdd==0 || (n==x && countOfOdd%2==0) || ( countOfEven==0 && x%2==0 ))
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int x=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++) a[i]=sc.nextInt();
			if(isPossible(a,n,x))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}