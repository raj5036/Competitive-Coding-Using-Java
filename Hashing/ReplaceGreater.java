import java.util.*;
class Replace{
    public static void main(String[] args){
        int a[]={2,1,4,5,1},max=Integer.MIN_VALUE;
        Vector<Integer> vector = new Vector<Integer>();
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(!vector.contains(a[i])){
                vector.add(a[i]);
            }else{
                vector.add(max+1);
                max++;
            }
        }
        System.out.println(vector);
    }
}