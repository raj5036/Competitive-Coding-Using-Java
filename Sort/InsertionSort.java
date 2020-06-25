import java.util.*;
import java.util.stream.*;
public class InsertionSort{
	static void insertionSort(int[] a){
		int n=a.length;
		for(int i=1;i<n;i++){
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int[] a={12,11,13,5,6};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}