import java.util.*;
public class Main{
	public static int getTheMaximumValue(int n,int m,int k){
		if(m==0)
			return 0;
		int eachSet=n/k;
		int[] sets=new int[k];
		if(m==eachSet || m<eachSet)
			return eachSet;
		Arrays.fill(sets,eachSet); // 3 3 3 
		int[] jokerDistribution=new int[k];
		if(m>eachSet)
			jokerDistribution[0]=eachSet;
		m=m-eachSet; // Updated value of Joker
		if(m>eachSet)
			jokerDistribution[1]=
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();

			getTheMaximumValue(n,m,k);
		}
	}
}
4
8 3 2
4 2 4
9 6 3
42 0 7

3
0
1
0
