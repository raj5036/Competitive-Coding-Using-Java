import java.util.*;
class Intro{
    static void countOccurence(String s){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Integer c = map.get(s.charAt(i));
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i),1);
            else{
                map.put(s.charAt(i),++c);
            }
        }
        System.out.println(map);
    }
    static void removeWhiteSpaces(String s){
        // List<Character> list=new ArrayList<Character>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=' '){
        //         list.add(s.charAt(i));
        //     }
        // }
        // String s2=list.toString();
        // System.out.println(s2);
        String s1=s.replaceAll("\\s","");
        System.out.println(s1);
    }
    static void findDuplicate(String s){

    }
    static void reverseString(String s){
        if(s==null || s.length()<=1)
            System.out.print(s);
        else{
            System.out.print(s.charAt(s.length()-1));
            reverseString(s.substring(0,s.length()-1));
        }
    }
    static boolean checkAnagram(String s1,String s2){
        char[] a=new char[s1.length()];
        char[] b = new char[s2.length()];
        a=s1.toCharArray();
        b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])
                    return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s=sc.nextLine();
        String s2 =sc.nextLine();
        //countOccurence(s);
        //removeWhiteSpaces(s);
        //reverseString(s);
        System.out.println(checkAnagram(s, s2));
    }
}