import java.util.*;

public class Main{
	public static int getInteger(String s,int index,int ans,int i){
		//return Integer.parseInt(s);

		if(index<s.length() && index>=0){
			ans += Math.pow(10,i) * Integer.parseInt(String.valueOf(s.charAt(index))); //4
			getInteger(s,index-1,ans,i+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		String s="1234";
		int ans=0;
		int n=getInteger(s,s.length()-1,ans,0);
		System.out.println(s);
	}
}