import java.util.*;

public class Main{
	public static void sortKSortedArrays(List<Integer> list,int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>(list.subList(0,k+1));
		int index=0;
		for(int i=k+1;i<list.size();i++){
			list.set(index++,pq.poll());
			pq.add(list.get(i));
		}
		while(!pq.isEmpty()){
			list.set(index++,pq.poll());
		}
	}
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(new Integer[]{1, 4, 5, 2, 3, 7, 8, 6, 10, 9}));
		int k=2;
		sortKSortedArrays(list,k);
		System.out.println(list);
	}
}