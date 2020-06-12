import java.util.*;

public class ShovelAndSwods{
	public static int maxEarning(int a,int b){
		if(a==0 || b==0)
			return 0;
		if(b>2*a)
			return a;
		if(a>2*b)
			return b;
        int	earning=(a+b)/3;
		return earning;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(maxEarning(a, b));
		}
	}
}