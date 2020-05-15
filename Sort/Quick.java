import java.util.*;
import java.io.*;
class Quick{
	 static int partition(int[] a,int low,int high){
		int i=low-1;
		int pivot=a[high];
		for(int j=low;j<high;j++){
			if(a[j]<=pivot){
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;

		return i+1;
	}
	static void QuickSort(int[] a,int low,int high){
		if(low<=high){
			int pi=partition(a,low,high);
			QuickSort(a,low,pi-1);
			QuickSort(a,pi+1,high);
		}
	}
	public static void main(String[] args) {
		int a[]={21,23,1,4,9,7};
		QuickSort(a,0,a.length-1);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}