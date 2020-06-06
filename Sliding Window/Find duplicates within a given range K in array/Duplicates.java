import java.util.*;
public class Duplicates{
	public boolean found(int[] a,int k){ //time=O(n) space=O(1)
		int i=0,j=1;
		int n=a.length;
		int duplicate=-1;
		while(i<n && j<n){
			if(a[i]==a[j]){
				if(j-i>k) return false;
				duplicate=a[i];
				System.out.println(duplicate);
				return true;
			}
			else
				j++;
			if(i!=n-1 && j==n-1){
				i+=1;
				j=i+1;
			}
		}
		return false;
	}
	public boolean found(int[] a,int n,int k){//time=O(n) space=O(n)
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<n;i++){
			if(!map.containsKey(a[i]))
				map.put(a[i],i);
			else{
				int dist=Math.abs(i-map.get(a[i]));
				if(dist>k)
					return false;
				else
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a={5,1,6,7,9,1};
		int k=2;
		Duplicates obj=new Duplicates();
		if(obj.found(a,a.length,k))
			System.out.println("Duplicates found");
		else
			System.out.println("Duplicates not found");
	}
}