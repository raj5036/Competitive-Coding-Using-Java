
import java.util.*;
class Hashing{
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(2, "Raj");
        hm.put(1,"jk");
        System.out.println(hm);

        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int array[]={2,3,3,1,2,3,2,1,5,4};
        
        for(int i=0;i<array.length;i++){
            Integer c=hmap.get(array[i]);
            if(hmap.get(array[i])==null){
                hmap.put(array[i], 1);
            }else{
                hmap.put(array[i], ++c);
            }
            System.out.println(c);
        }
        System.out.println(hmap);
        // System.out.println("Size "+hmap.size());
        // hmap.clear();
        // System.out.println("Is map Empty :" + hmap.isEmpty());
        // System.out.println(hmap.containsKey("raj"));

        // HashSet<Integer> obj = new HashSet<Integer>();
        // obj.add(1);
        // obj.add(2);
        // System.out.println(obj);
        // Iterator<Integer> it  = obj.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        }
    }
