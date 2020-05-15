import java.util.*;
public class Main{
	public static void main(String[] args) {
		String s="abcdabcdabcd";
		String test="abcdabcdabcdefgebjbkjhklk<NDknwkdknMDNk";
		int[] hash=new int[26];
		for(char c: s.toCharArray()){
			hash[c-'a']++;
		}
		for(char c:test.toCharArray()){
			if(--hash[c-'a']<0){
				System.out.println("false");
				break;
			}
		}
		for(int i=0;i<hash.length;i++)
			System.out.println((i+1) +" "+hash[i] );
	}
}