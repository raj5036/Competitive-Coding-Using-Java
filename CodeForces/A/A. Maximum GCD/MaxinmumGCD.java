import java.util.*;
import java.util.stream.*;
class MaximumGCD{
	static int GCD(int a,int b){
		int GCD=-1;
		for(int i=1;i<=a && i<=b;i++)
			if(a%i==0 && b%i==0)
				GCD=i;
		return GCD;
	}
	static int getTheMaximumGCD(int n){
		int maxGCD=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				if(i!=j){
					int gcd=GCD(i,j);
					maxGCD=Integer.max(maxGCD,gcd);
				}
		return maxGCD;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			System.out.println(getTheMaximumGCD(n));
		}
	}
}
