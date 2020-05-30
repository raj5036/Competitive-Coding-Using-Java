import java.util.*;

public class Main{
	public static void mergedArray(int[][] a,int size,int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				pq.add(a[i][j]);
			}
		}
		
		while(!pq.isEmpty())
			System.out.print(pq.poll()+" ");
	}
	public static void main(String[] args) {
		int[][] a={
			{1,3,5,7},
			{2,4,6,8},
			{0,9,10,11}
		};
		int size=a.length;
		int k=3;

		System.out.println("The merged sorted array is :");
		mergedArray(a,size,k);
	}
}