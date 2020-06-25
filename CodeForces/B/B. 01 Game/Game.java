import java.util.*;
import java.util.stream.*;
import java.lang.*;

public class Game{
	static boolean consistsOnly(StringBuilder s){
		int count=0;
		for(int i=0;i<s.length();i++){
			//System.out.println("count "+ count);
			if(s.charAt(i)=='1')
				count++;
			else
			 	count--;
		}
		if(Math.abs(count)==s.length())
			return true;
		return false; 
	}
	static boolean isAdjecentValuesExists(String s){
		if(s.contains("01") || s.contains("10"))
			return true;
		return false; 
	}
	static int game(StringBuilder s,int turn){
		//System.out.println(s.length()+" "+" consistsOnly "+ consistsOnly(s)+" isAdjecentValuesExists "+isAdjecentValuesExists(s.toString()));
		if(s.length()<2 || consistsOnly(s) || !isAdjecentValuesExists(s.toString()))
			return turn;
		for(int i=0;i<s.length()-1;i++)
			if((s.charAt(i)=='0' && s.charAt(i+1)=='1') || (s.charAt(i)=='1' && s.charAt(i+1)=='0')){
				s.delete(i,i+2);
				break;
			}

		return game(s,turn+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			String s=sc.next();
			StringBuilder sb=new StringBuilder(s);
			int loosersTurn=game(sb,0);
			if(loosersTurn%2==0)
				System.out.println("NET");
			else
				System.out.println("DA");
		}		
	}
}