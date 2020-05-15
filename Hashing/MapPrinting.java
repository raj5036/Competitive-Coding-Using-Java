import java.util.*;
class MapPrinting{
    static String stringCompress(String s){
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Integer c=map.get(s.charAt(i));
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),++c);
        }
        Iterator<Character> i=map.keySet().iterator();
        Iterator<Integer> i1 = map.values().iterator();
        StringBuffer s1 = new StringBuffer();
        while(i.hasNext() && i1.hasNext()){
            s1.append(i.next());
            s1.append(i1.next());
        }
        return s1.toString();    
    }
    public static void main(String[] args) throws NoSuchElementException{
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(stringCompress(s));
    }
}