import java.util.*;
class ValidParanthesis{
	public Boolean check(String s){
		int low=0,high=0;
		for(char c: s.toCharArray()){
			low += c=='('? 1:-1;
			high += c!=')' ?1 :-1;
			if(high<0)
				break;
			low=Math.max(low,0);
		}
		return low==0;
	}
	public static void main(String[] args) {
		String braces ="()()()()";
		ValidParanthesis obj=new ValidParanthesis();
		System.out.println(obj.check(braces));
	}
}