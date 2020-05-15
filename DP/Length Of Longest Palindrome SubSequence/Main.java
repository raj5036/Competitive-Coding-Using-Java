import java.util.*;

class Main{
	public static int lengthPalDP(String s ,int i,int j,Map<String,Integer> lookUpTable){
		if(i>j)
			return 0;
		String key=i+"|"+j;
		if(!lookUpTable.containsKey(key)){
			if(i==j)
				lookUpTable.put(key,lengthPalDP(s,i+1,j-1,lookUpTable)+1);
			else if(s.charAt(i)==s.charAt(j))
				lookUpTable.put(key,lengthPalDP(s,i+1,j-1,lookUpTable)+2);
			else
				lookUpTable.put(key,Integer.max(lengthPalDP(s,i+1,j,lookUpTable) , lengthPalDP(s,i,j-1,lookUpTable) ));
		}
		return lookUpTable.get(key);
	}
	public static int lengthOfLongestPalindrome(String s,int i,int j){
		if(i>j)
			return 0;
		if(i==j)
			return lengthOfLongestPalindrome(s,i+1,j-1)+1;
		if(s.charAt(i)==s.charAt(j))
			return lengthOfLongestPalindrome(s,i+1,j-1)+2;
		return Integer.max(lengthOfLongestPalindrome(s,i,j-1),lengthOfLongestPalindrome(s,i+1,j));
	}
	public static void main(String[] args) {
		String a="rcbabchkhfdskj";
		int n=lengthOfLongestPalindrome(a,0,a.length()-1);
		System.out.println(n);
		HashMap<String,Integer> lookUpTable=new HashMap<>();
		int ans=lengthPalDP(a,0,a.length()-1,lookUpTable);
		System.out.println(ans);
	}
}