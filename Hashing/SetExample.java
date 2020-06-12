import java.util.*;
import java.lang.*;
class Example{
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4}));
        int i=new ArrayList<>(a).indexOf(2);
        System.out.println(i);

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {2,3,4,5}));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union : "+union);
        

        Set<Integer> interSection = new HashSet<Integer>(a);
        interSection.retainAll(b);
        System.out.println("interSection : "+interSection);
    }
}