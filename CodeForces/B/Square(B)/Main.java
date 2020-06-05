import java.util.*;

public class Main{
	public static boolean isSquare(int a1,int b1,int a2,int b2){
		int area1=a1*b1;
		int area2=a2*b2;

		int total=area1+area2;
		int sq=total;

		// double res=Math.sqrt(total);
		// return res-Math.floor(res)==0;
		for(int i=1;i<total/2;i++){
			if(i*i==sq)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			int a1=sc.nextInt();
			int b1=sc.nextInt();

			int a2=sc.nextInt();
			int b2=sc.nextInt();

			if(isSquare(a1,b1,a2,b2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}