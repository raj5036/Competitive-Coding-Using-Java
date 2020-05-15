import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrome{
	static boolean isPalindromeRec(String str,int s,int e){
		if(s==e) return true;
		if(str.charAt(s)!=str.charAt(e)) return false;
		if(s<e+1)
			isPalindromeRec(str,s+1,e-1);
		return true;
	}
	public static int checkPalindrome(String a,int s,int e){
		if(s>e)
			return 0;
		if(s==e)
			return 1;
		if(a.charAt(s)==a.charAt(e))
			return checkPalindrome(a,s+1,e-1)+2;
		return Integer.max(checkPalindrome(a,s+1,e),checkPalindrome(a,s,e-1));
	}
	static boolean isPalindrome(String s){
		int length=s.length();
		if (length==0 || length==1) return true;
		
		return isPalindromeRec(s,0,length-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//System.out.println(isPalindrome(s));
		int len=checkPalindrome(s,0,s.length()-1);
		System.out.println(len);
		System.out.println(len==s.length());
	}
}