import java.util.*;

public class Main{
	public static void main(String[] args) {
		int[] inDegree=new int[1001];
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();

		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int x=sc.nextInt();
			for(int i=1;i<=n-1;i++){
				int src=sc.nextInt();
				int dest=sc.nextInt();
				inDegree[src]++;
				inDegree[dest]++;
			}
			if(inDegree[x]<=1){
				System.out.println("Ayush"); break;
			}
			System.out.println((n%2==1)?"Ashish":"Ayush");
		}
	}
}