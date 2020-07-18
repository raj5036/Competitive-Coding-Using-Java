import java.util.*;
public class Solution{
	void printValues(int x,int y,int z){
		if(x==y && y==z){
			for(int i=1;i<=3;i++)
				System.out.print(x+" ");
			return;
		}

		System.out.println("NO");
	}
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			System.out.println(obj.printValues(x,y,z));
		}
	}
}