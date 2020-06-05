import java.util.*;

public class Main{
	public static int minimumOperation(String temp){
		int zero=0;
		int one=0;
		for(char c:temp.toCharArray()){
			if(c=='1') one++;
			else zero++;
		}
		int ans=Math.min(one,zero);
		int changeIntoOne=0,changeIntoZero=0;
		for(char c: temp.toCharArray()){
			if(c=='1'){
				changeIntoZero++;
				one--;
			}else{
				changeIntoOne++;
				zero--;
			}
			int cur_ans = changeIntoOne + one;
			int cur_ans2 = changeIntoZero + zero;
			ans = Math.min(ans, Math.min(cur_ans, cur_ans2));
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			String s=sc.next();
			System.out.println(minimumOperation(s));
		}
	}
}