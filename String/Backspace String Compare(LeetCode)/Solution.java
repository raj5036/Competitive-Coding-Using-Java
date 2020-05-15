import java.util.*;
public class Solution{
    public String formatString(String s){  
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#')
                stack.push(s.charAt(i));
            else
                if(!stack.isEmpty())
                    stack.pop();
        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty())
            ans.append(stack.pop());
        
        StringBuilder result=ans.reverse();
        return result.toString();
    }
    public boolean backspaceCompare(String S, String T) {
        String S1=formatString(S);
        String T1=formatString(T);
        if(S1.equals(T1))
            return true;
        else 
            return false;
    }

	public static void main(String[] args) {
		String S="Raj";
		StringBuilder S1=new StringBuilder(S);
		//S1.charAt(1)='A';
		System.out.println(S1.charAt(2));
	}
}