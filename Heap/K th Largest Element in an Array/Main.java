import java.util.*;

public class Main{
	public static int kThLargestElement(int[] a,int k,int size){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<size;i++){
			pq.add(a[i]);
			if(i>=k){
				pq.poll();
				
			}
		}
		return pq.poll();
	}
	public static int kThLargestElement(int[] a,int k){
		Arrays.sort(a);
		return a[a.length-k];
	}
	public static void main(String[] args) {
		int[] a={2,1,5,7,0,3};
		int k=3;
		System.out.println(kThLargestElement(a,k));
		System.out.println(kThLargestElement(a,k,a.length));
	}
}
//2 3 5 7