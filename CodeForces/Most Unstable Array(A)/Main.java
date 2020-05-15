import java.util.*;

public class Main{
	public static int getTheMaximumValue(int n,int m){
		if(n==1)
			return 0;
		if(n==2)
			return m;
		return 2*m;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();

		for(int i=0;i<testCase;i++){
			int n=sc.nextInt();
			int m=sc.nextInt();

			System.out.println(getTheMaximumValue(n,m));
		}
	}
}