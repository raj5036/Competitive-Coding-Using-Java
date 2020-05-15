import java.util.*;
class Denomination{
	static int maxDivide(int a,int b){
		if(a>b){
			a=a/b;
		}
		return a;
	}
	
	public static void  main(String[] args){
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int real=num;
		int deno10=maxDivide(num,10);
		int rem=real%10;
		int deno2=maxDivide(rem,2);
		int deno1=real-(deno10*10+deno2*2);
	
		System.out.println(deno10+" "+deno2+" "+deno1);
	}
}