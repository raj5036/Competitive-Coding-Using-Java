import java.util.*;
import java.util.stream.*;
public class StringPermutation{
	public static String swap(String s,int i,int j){
		char[] charArray=s.toCharArray();
		char temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	public static void permute(String s,int l,int r,List<String> list){
		if(l==r)
			list.add(s);
		else
			for(int i=l;i<=r;i++){
				s=swap(s,l,i);
				permute(s,l+1,r,list);
				s=swap(s,l,i); 
			}
	}
	public static void main(String[] args) {
		String s="123";
		List<String> list=new ArrayList<>();
		permute(s,0,s.length()-1,list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(1));
	}
}