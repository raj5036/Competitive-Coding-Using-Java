import java.util.*;
class LongestPrefixSuffix{
    static String longestPrefixSuffix(StringBuffer s){
        int low=0;
        int high=(s.length()%2==0)?s.length()/2 : (s.length()/2)+1;
        StringBuffer res=new StringBuffer();
        while(s.charAt(low)!=s.charAt(high)){
            high++;
        }
        while(low<high && high<=s.length()-1){
            
                res.append(s.charAt(high));
                high++;
            
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        StringBuffer s=new StringBuffer();
        s.append(sc.nextLine());
        String res=longestPrefixSuffix(s);
        System.out.println(res);
    }
}