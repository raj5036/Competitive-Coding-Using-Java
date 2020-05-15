import java.util.*;

public class Main{
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<5;i++)
			stack.push(new Integer(i));
		//stackReverse(stack);
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
}