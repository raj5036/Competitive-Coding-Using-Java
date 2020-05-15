import java.util.*;
class ArrayTarget{
    int[] targetElements(int a[],int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            map.put( a[i],i);
        }
        
        for(int i=0;i<a.length;i++){
            int complement = target-a[i];
            if(map.containsKey(complement) && map.get(complement)!=i)
                return new int[] {i,map.get(complement)}; 
        }
      return a;   
    }
    public static void main(String[] args){
        int a[]={2,3,4,6,7,8};
        int target=10;
        ArrayTarget obj = new ArrayTarget();
        int res[]=obj.targetElements(a, target);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}