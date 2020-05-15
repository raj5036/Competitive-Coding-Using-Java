import java.util.*;
public class Main{
	public static int[] productOfArrayExceptItself(int[] a){
		int[] res=new int[a.length]; //1 2 3 4
		int product=1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i!=j){
					product *= a[j];
				}
			}
			res[i]=product;
			product=1;
		}
		return res;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int [] res=productOfArrayExceptItself(a);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
}