import java.util.*;
public class EvaluateExpression{
	public static void main(String[] args) {
		Stack<String> operands=new Stack<String>();
		Stack<Integer> values=new Stack<Integer>();
		String s="((2*3)+(4*5))";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='/'||s.charAt(i)=='-')
				operands.push(String.valueOf(s.charAt(i)));  //( ( * + *
			else if(s.charAt(i)==')'){
				Integer value=values.pop(); //3
				String operand=operands.pop(); //*
			
				if(operand.equals("*"))      value=value*values.pop();
				else if(operand.equals("+")) value=value+values.pop();
				else if(operand.equals("-")) value=value-values.pop();
				else if(operand.equals("/")) value=value/values.pop();

				values.push(value); //6
			}
			else
				values.push(Integer.parseInt(String.valueOf(s.charAt(i))));
		}
		System.out.println(values.pop()+values.pop());
		while(!operands.isEmpty())
			System.out.println(operands.pop());
	}
}