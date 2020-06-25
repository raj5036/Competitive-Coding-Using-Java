import java.util.*;
import java.util.stream.*;
public class ShortSubstring{
	public static String getRealString(String b){
		int length=b.length();
		char firstLetter=b.charAt(0);
		char lastLetter=b.charAt(length-1);
		StringBuilder temp=new StringBuilder();
		for(int i=1;i<length-1;i+=2){
			temp.append(b.charAt(i));
		}
		return firstLetter+temp.toString()+lastLetter;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			String b=sc.next();
			String a=getRealString(b);
			System.out.println(a);
		}
	}
}