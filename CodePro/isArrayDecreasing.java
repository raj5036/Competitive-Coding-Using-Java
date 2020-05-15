import java.util.*;
class isArrayDecreasing{
	static boolean isArrayCanBeDecreasing(int[] a){
		int count=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1])
				count++;
		}
		if(count>=2) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		int b[]={13,4,1};
		System.out.println(isArrayCanBeDecreasing(b));
	}
}