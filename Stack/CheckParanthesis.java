import java.util.*;
class CheckParanthesis{
	Boolean isMatchingPair(char a,char b){
		if(a=='[' && b==']')
			return true;
		if(a=='{' && b=='}')
			return true;
		if(a=='(' && b==')')
			return true;
		return false;
	}
	boolean checkParanthesis(char[] braces){
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<braces.length;i++){
			if(braces[i]=='[' || braces[i]=='{' || braces[i]=='(')
				stack.push(braces[i]);
			else{
				if(braces[i]==']' || braces[i]=='}' || braces[i]==')'){
					if(stack.isEmpty())
						return false;
					char brace=stack.pop();
					if(!isMatchingPair(brace,braces[i]))
						return false;
				}
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}
	public static void main(String[] args) {
		char[] braces={'[','{','(',')','}',']',')'};
		//{'[','(','{','}',')',']'};
		CheckParanthesis obj=new CheckParanthesis();
		boolean result=obj.checkParanthesis(braces);
		System.out.println(result);
	}
}