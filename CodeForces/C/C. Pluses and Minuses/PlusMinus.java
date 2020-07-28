import java.util.*;
import java.util.stream.*;
import java.lang.*;
public class PlusMinus{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		/*for(int index=0;index<t;index++){
			String s=sc.next();
			int res=0,cur=-1;boolean ok;
			for(int init=0;init<Integer.MAX_VALUE;init++){
				cur=init;
				ok=true;
				for(int i=0;i<s.length();i++){
					res=res+1;
					if(s.charAt(i)=='+') cur++;
					else cur--;
					if(cur<0){
						ok=false;
						break;
					}
				}
				if(ok) break;
			}
			System.out.println(res);
		}*/
		while(t-- >0){
			String s=sc.next();
			long res=0,cur=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='+') cur++;
				if(s.charAt(i)=='-') cur--;
				if(cur<0){
					res+=i+1;
					cur=0;
				}
			}
				System.out.println(res+s.length());
		}
	}
}