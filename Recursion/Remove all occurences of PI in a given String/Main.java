import java.util.*;

public class Main{
	public static final double PI=3.14;
	public static String removePI(StringBuilder s){
		/*if(index>n-1)
			return;
		if(s.charAt(index)=='p' && s.charAt(index+1)=='i'){
			s.replace(index,index+2,String.valueOf(PI));
		}
		removePI(s,n,index+1);*/
		String s1=s.toString().replaceAll("pi",String.valueOf(PI));
		return s1;
	}
	public static void removePI(StringBuilder s,int n,int index){
		if(index==n)
			return;
		if(s.charAt(index)=='p' && s.charAt(index+1)=='i'){
			s.replace(index,index+2,"3.14");
			//removePI(s,n,index+2);
		}
		removePI(s,n,index+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder(sc.next());
		
		//System.out.println(removePI(s));
		removePI(s,s.length(),0);
		System.out.println(s.toString());	
	}
}