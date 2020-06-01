import java.util.*;

public class Main{
	public static boolean isGoodString(String a,String b){
		int index=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==b.charAt(index)){
				index++;
				if(index==b.length()) break;
			}
		}
		//System.out.println( index!=b.length() );
		return index!=b.length();
	}
	public static int minimumOperation(String s){
		String sub1="010";
		String sub2="101";
		if(isGoodString(s,sub1) && isGoodString(s,sub2))
			return 0;
		else{
			int operation=0;
			StringBuilder temp=new StringBuilder(s);
			for(int i=0;i<temp.length();i++){
				if(temp.charAt(i)=='1'){
					temp.setCharAt(i,'0');
					operation++;
				}else if(temp.charAt(i)=='1'){
					temp.setCharAt(i,'0');
					operation++;
				}
				if(isGoodString(temp.toString(),sub1) && isGoodString(temp.toString(),sub2)) break;
			}
			return operation;
		}
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