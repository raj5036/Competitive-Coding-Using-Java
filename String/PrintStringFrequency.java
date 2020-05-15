import java.util.*;

class PrintStringFrequency{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      String s=sc.next();
      sc.close();
      Map<Character,Integer> map=new HashMap<Character,Integer>();
      for(int i=0;i<s.length();i++){
            Integer c=map.get(s.charAt(i));
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i),1);
            else{
                map.put(s.charAt(i),++c);
            }
      }
      
    }
}