import java.util.*;
import java.util.stream.*;
public class NumberGame{
	static int game(int n){
		if(n>1){
			n--;
			return n;
		}
		for(int i=2;i<=n;i++)
			if(i%2==1 && n%i==0){
				n=n/i;
				break;
			}
		return n;
	}
	static String getWinner(int n,int turn){
		int updatedN=game(n);
		System.out.println(updatedN);
		if(n==1){
			if(turn%2==0)
				return "FastestFinger";
			else
				return "Ashishgup";
		}
		return getWinner(updatedN,turn+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			System.out.println(getWinner(n,0));
		}
	}
}