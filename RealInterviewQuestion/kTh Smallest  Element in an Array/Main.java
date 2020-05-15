import java.util.*;
public class Main{
	static void deleteArrayElement(int[] a,int index){
		if(index>=a.length)
			return;
		for(int i=index;i<a.length-1;i++)
			a[i]=a[i+1];
		
	}
	public static int kThLargestElement(int[] a,int k){  //4 6 3 9 k=2 min=3  //4 6 9 k=1 min=4
		int min=a[0],index=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
				index=i;
			}
		}
		if(k==1)
			return min;
		else{
			deleteArrayElement(a,index);
			return kThLargestElement(a,k-1);
		}
	}
	public static void main(String[] args) {
		int k=3;
		int[] a={4,2,6,3,9};
		System.out.println(kThLargestElement(a,k));
	}
}