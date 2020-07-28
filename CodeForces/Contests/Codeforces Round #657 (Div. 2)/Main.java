import java.util.*;
public class Main{

	boolean function(String s,String pattern,int n){
		int left=0,right=0;
		int i=0;
		while(left<n && right<n){
			if(s.charAt(right)==pattern.charAt(i)) {
				right++;
				i++;
				if(i==pattern.length())
					i=0;
			}else{
				if(s.charAt(right)=='?'){
					i++;
				}
				else{
					//Slide the window
					left=right+1;
					right=left;
					i=0;
				}
			}
			if(right-left==pattern.length()-1)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Main obj=new Main();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			
			String pattern="abacaba";
			if(obj.function(s,pattern,n))
				System.out.println("Yes");
			else
				System.out.println("No");			
		}
	}
}