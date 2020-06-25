import java.util.*;
import java.util.stream.*;
import java.lang.*;
public class LexographicallySmallerString{001011 pointer=2
	static boolean isStringClean(String s){
		int pointer=-1;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='1')
				pointer=i;
		for(int i=0;i<s.length();i++)
			if( (s.charAt(i)=='0' && i>pointer )||(s.charAt(i)=='1') && i<pointer)
				return false;
		return true;
	}
	static String cleanestString(int n,String s){
		if(isStringClean(s))
			return s;
		StringBuilder temp=new StringBuilder(s);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
			int n=sc.nextInt();
			String s=sc.next();
			System.out.println(cleanestString(s,n));
		}
	}
}