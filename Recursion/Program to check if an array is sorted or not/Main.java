import java.util.*;

public class Main{
	public static boolean isSorted(int[] a,int index){
		if(index<a.length-1){
			if(a[index]<a[index+1])
				return isSorted(a,index+1);
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,0};
		boolean ans=isSorted(a,0);
		System.out.println(ans);
	}
}