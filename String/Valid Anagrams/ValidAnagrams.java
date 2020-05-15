import java.util.*;
class Solution {
    public Boolean checkAnagram(String a,String b){
        if(a.length() != b.length())
            return false;
        char[] test=new char[256];
        char[] aTest=a.toCharArray();
        char[] bTest=b.toCharArray();
        
        for(int i=0;i<aTest.length;i++){
            test[aTest[i]]++;
            test[bTest[i]]--;
        }
        for(int i=0;i<aTest.length;i++)
            if(test[i]!=0)
                return false;
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()==0 || s==null)
            return ans;
        int[] char_count=new int[26];
        Arrays.fill(char_count,0);
        for(char c : p.toCharArray()){
            char_count[c-'a']++;
        }
        for(int i=0;i<char_count.length;i++)
        	System.out.print(char_count[i]+" ");
        return ans;
    }
    public static void main(String[] args) {
    	Solution obj=new Solution();
    	String s="cbaebabacd";
    	String p="abc";
    	List<Integer> ans=obj.findAnagrams(s,p);
    	System.out.println(ans);
    }
}