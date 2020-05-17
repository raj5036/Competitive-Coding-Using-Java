import java.util.*;

public class Main{
	public static int printAK(int a1,int k){
		if(a1==0)
			return 0;
		if(k==1)
			return a1;
		int temp=a1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		do{
			int digit=a1%10;
			if(digit>max)
				max=digit; //7 //8
			if(digit<min)
				min=digit; //7 //7 //4
			a1=a1/10;
		}while(a1!=0);

		a1=temp;

		int a2=a1+max*min;
		return printAK(a2,k-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++){
			int a1=sc.nextInt();
			int k=sc.nextInt();

			System.out.println(printAK(a1,k));
		}
	}
}