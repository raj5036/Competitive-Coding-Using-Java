import java.util.*;
class TheComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		String firstString=s1;
		String secondString=s2;

		return(firstString.compareTo(secondString));
	}
} 
class Basic{
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(4);

		System.out.println(pq);
		System.out.println("PriorityQueue contains 4 : " + pq.contains(4));
		System.out.println("Its size is : "+pq.size());

		Comparator comp=pq.comparator();
		System.out.println(pq);

		//After Implementing Comparator

		PriorityQueue<String> queue=new PriorityQueue<String>(new TheComparator());
		queue.add("G"); 
        queue.add("E"); 
        queue.add("E"); 
        queue.add("K"); 
        queue.add("S"); 
        queue.add("4"); 

        System.out.println(queue);
	}
}