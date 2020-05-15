import java.util.*;

public class Main{ 
	public static boolean complementary(char a,char b){
		return(a=='N' && b=='S') || (a=='S' && b=='N') || (a=='E' && b=='W') || (a=='W' && b=='E');
	}
	public static int getTotalTime(String s){ //SSNWNEN
		int totalTime=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			if(stack.empty()){ 
				 stack.push(s.charAt(i));
				 totalTime+=5;
			}
			else if(complementary(s.charAt(i), stack.peek())){
				totalTime+=1;
				stack.pop(); //NE
			}else if(stack.size()!=s.length()){
				stack.push(s.charAt(i));
				totalTime+=5;
			}
		}
		return totalTime;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int TestCase=sc.nextInt();

		for(int i=0;i<TestCase;i++){
			String s=sc.next();
			System.out.println(getTotalTime(s));
		}
	}
}
//NNN=15
//NS=6