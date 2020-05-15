import java.util.*; 
import java.util.stream.*; 

class IntersectArray{ 

	// Generic function to convert an Array to Set 
	public static <T> Set<T> convertArrayToSet(T array[]) {

		Set<T> set = new HashSet<>(Arrays.asList(array)); 
		return set; 
	} 

	public static void main(String args[]) {
		Integer a[]={1,2,3,4};
		Integer b[]={3,4,5,6};
		Set<Integer> set1=convertArrayToSet(a);
		Set<Integer> set2=convertArrayToSet(b);
		System.out.println("Set1 "+set1);
		System.out.println("Set2 "+set2);
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union"+union);	
		Set<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection"+intersection);	 
	} 
} 
