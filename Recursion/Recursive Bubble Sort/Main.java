import java.util.*;

public class Main{
	public static void bubbleSort(int[] a,int i){
		for(int j=0;j<a.length-i-1;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		if(i<a.length)
			bubbleSort(a,i+1);
	}
	public static void main(String[] args) {
		int[] a={21,34,22,98,-1};
		bubbleSort(a,0);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}