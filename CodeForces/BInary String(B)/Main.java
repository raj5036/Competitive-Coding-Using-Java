import java.util.*;
public class Main{
	public static String getString(String s){
		if(s.length()<=2)
			return s;
		char[] str=s.toCharArray(); // 1 1 1
		int period=1;
		for(int i=0;i<str.length-1;i++){
			if(str[i]==str[i+1]){
				period+=1;
			}
		}
		if(period==s.length())
			return s;
		return s+s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			String s=sc.next();
			System.out.println(getString(s));
		}
	}
}
/*
	1. 00
	2. 01
	3. 111
	4. 110

	1. 00
	2. 01
	3. 111 111
	4. 1010
*/