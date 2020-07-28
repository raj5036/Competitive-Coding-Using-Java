import java.util.*;
public class Solution{
	int function(int level){
		if(level==0)
			return 1;
	}
	static final long M=(long)Math.pow(10,9)+7;
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			System.out.println(obj.function(n));
		}
	}
}