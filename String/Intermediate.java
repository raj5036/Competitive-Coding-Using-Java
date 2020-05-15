import java.util.*;
class Intermediate{
    static boolean checkRotation(String s1,String s2){
        String s3 = s1+s1;
        if(s3.contains(s2)){
            return true;
        }else{
            return false;
        }
    }
    static void removeDuplicate(String s){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }
        }
        char[] a = new char[s.length()];
        //String c=map.keySet();
        for(int i=0;i<a.length;i++){
            System.out.println(map.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(checkRotation(s1, s2));
    }
}