import java.util.*;
import java.util.stream.*;
public class SocialDistance{
	public static boolean isValidString(String s,int k){
		if(!s.contains('1'))
			return true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==1){
				for(int j=i;j<=i+k;j++)
					if(j>=0 && j<s.length() && s.charAt(j)==1) 
						return false;
				for(int j=i;j>=i-k;j--)
					if(j>=0 && j<s.length() && s.charAt(j)==1)
						return false;
			}
		}
		return true;
	}
	public static boolean isCompletelyFilled(String s,int k){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==1){
				if(i+k+1<s.length() && s.charAt(i+k+1)==1 && i-k-1>=0 && s.charAt(i-k-1)==1)
					continue;
				else 
					return false;
			}
		}
		return true;
	}
	public static int maximumSeats(String s,int n,int k,int count){
		if(!isValidString(s,k)) return count;
		if(s.charAt(index)==1)
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			System.out.println();
		}
	}
}