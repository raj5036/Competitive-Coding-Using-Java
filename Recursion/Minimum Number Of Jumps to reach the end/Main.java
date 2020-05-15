import java.util.*;

public class Main{
	public static int getMinJumps(int[] a,int index,int minJumps){
		if(a[0]==0 || a.length==0)
			return Integer.MAX_VALUE;
		int[] jump=new int[a.length];
		jump[0]=0;

		for(int i=1;i<a.length;i++){
			jump[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(i<=j+a[j]  && jump[j]!=Integer.MAX_VALUE)
					jump[i]=Math.min(jump[i],jump[j]+1);
			}
		}
		return jump[a.length-1];
	}
	public static void main(String[] args) {
		int[] a={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(getMinJumps(a,0,0));
	}
}