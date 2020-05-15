import java.util.*;
class removeVowel{
    static void StringBufferImp(){
        StringBuffer s=new StringBuffer(12);
        //Get Capacity
        System.out.println(s.capacity());
        System.out.println(s.length());
        StringBuffer s2 = new StringBuffer("GeeksForGeeks");
        //String Reverse
        System.out.println(s2.reverse());
        s2.reverse();
        //Appending
        s2.append(" : For Computer Science Students");
        System.out.println(s2);
        s2.insert(0, 5+" ");
        System.out.println(s2);
        //Deleting
        s2.delete(0, 1);
        s2.deleteCharAt(s2.length()-1);
        System.out.println(s2);
        //Replacing
        s2.replace(0, 5, "OK ");
        System.out.println(s2);
    }
    static void removeVowelBruteForce(String s){
        StringBuffer s2 = new StringBuffer(s);
        Character[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = Arrays.asList(vowels);

        for(int i=0;i<s2.length();i++){
            if(list.contains(s2.charAt(i))){
                s2.replace(i, i+1, "");
                i--;
            }
        }
        System.out.println(s2.toString());
    }
    static String removeVowelFromString(String s){
        return s.replaceAll("[aeiouAEIOU]", "");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        //System.out.println(removeVowelFromString(s));
        //StringBufferImp();
        removeVowelBruteForce(s);
    }
}