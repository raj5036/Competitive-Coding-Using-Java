import java.util.*;
import java.util.stream.*;

public class Interleaving{
	public static boolean interleaved(String x,String y,String s){
		if(x.length()==0 && y.length()==0 && s.length()==0)
			return true;
		if(s.length()==0)
			return false;
		boolean a=(x.length()!=0 && x.charAt(0)==s.charAt(0)) && interleaved(x.substring(1),y,s.substring(1));
		boolean b=(y.length()!=0 && y.charAt(0)==s.charAt(0)) && interleaved(x,y.substring(1),s.substring(1));

		return a||b;
	}
	public static boolean interleavedUsingDP(String x,String y,String s,HashMap<String,Boolean> dp){
		if(x.length()==0 && y.length()==0 && s.length()==0)
			return true;
		if(s.length()==0)
			return true;
		String key=x+"|"+y+"|"+s;
		if(!dp.containsKey(key)){
			boolean a=(x.length()!=0 && x.charAt(0)==s.charAt(0)) && interleavedUsingDP(x.substring(1),y,s.substring(1),dp);
			boolean b=(y.length()!=0 && y.charAt(0)==s.charAt(0)) && interleavedUsingDP(x,y.substring(1),s.substring(1),dp);

			dp.put(key,a||b);
		}
		return dp.get(key);
	}
	public static void main(String[] args) {
		String X = "ABC";
		String Y = "DEF";
		String S = "ADEBFC";
		System.out.println((interleaved(X,Y,S)?"Yes":"No"));
		HashMap<String,Boolean> dp=new HashMap<>();
		System.out.println(interleavedUsingDP(X,Y,S,dp)?"YES":"NO");
	}
}