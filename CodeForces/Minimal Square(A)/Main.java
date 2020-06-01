import java.util.*;
public class Main{
	public static int getMinimalSquare(int a,int b){
		if(a==b)
			return 4*(int)Math.pow(a,2);
		int length=Math.max(a,b);
		int width=Math.min(a,b);
		if(2*width>=length)
			return (int)Math.pow(2*width,2);
		else
			return (int)Math.pow(length,2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(getMinimalSquare(a,b));
		}
	}
}