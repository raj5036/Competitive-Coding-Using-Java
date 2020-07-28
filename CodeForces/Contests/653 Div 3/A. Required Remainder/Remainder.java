import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.stream.*;
public class Remainder{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			int ans=-1;
			for(int i=0;i<n;i++){
				if(i%x==y)
					ans=i;
			}
			System.out.println(ans);
		}
	}
}