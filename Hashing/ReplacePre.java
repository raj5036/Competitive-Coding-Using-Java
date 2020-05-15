import java.util.*;
class rep{
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        int a[] = {1,2,3,3,4,5,5,7};
        for(int i=0;i<a.length;i++){
            if(!vector.contains(a[i]))
                vector.add(a[i]);
            else{
                for(int j=a[i]+1;j<Integer.MAX_VALUE;j++){
                    if(!vector.contains(j)){
                        vector.add(j);
                        break;
                    }
                }
            }
        }
        System.out.println(vector);
    }
}