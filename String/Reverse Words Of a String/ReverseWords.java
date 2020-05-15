import java.util.*;
public class ReverseWords{
	public String reverseWords(String s){
		StringBuilder test=new StringBuilder();
		StringBuilder result=new StringBuilder();
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' '){
				test.append(s.charAt(i)); //"The"
			}else{
				result.append(test.reverse());//"ehT"
				result.append(' ');

				test.setLength(0);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String s="The cat in the hat";
		ReverseWords object=new ReverseWords();
		String result=object.reverseWords(s+" ");
		System.out.println(result);
	}
}