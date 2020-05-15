import java.util.*;

public class Main{
	public static int[] getBalancedArray(int[] temp,int n){
		int[] a=new int[n];
		if((n/2)%2!=0)
			return a;
		for(int i=0,j=n/2 ; i<n/2 ; i++,j++){
			a[i++]=temp[0];
			a[i]=temp[1];
			a[j++]=temp[2];
			a[j]=temp[3];

			for(int id=0;id<temp.length;id++)
				temp[id] += 6;	
		}
		return a;
	}
	public static void main(String[] args) {
		int[] temp={2,4,1,5};
		int n=123;
		int[] a=getBalancedArray(temp,n);
		System.out.println(Arrays.toString(a));
	}
}