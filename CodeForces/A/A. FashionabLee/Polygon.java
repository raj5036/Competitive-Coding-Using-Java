import java.util.*; 
import java.util.stream.*;
import java.lang.*;
public class Polygon{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			if(n%4==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}