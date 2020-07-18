import java.util.*;
public class Solution{
	int[] getPermutation(int[] a){
		List<Integer> set=new ArrayList<Integer>();
		for(int num:a)
			if(!set.contains(num))
				set.add(num);
		int[] ans=new int[a.length/2];
		Iterator<Integer> it=set.iterator();
		for(int i=0;i<ans.length && it.hasNext();i++)
			ans[i]=it.next();
		return ans;
	}
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[2*n];
			for(int i=0;i<a.length;i++)
				a[i]=sc.nextInt();
			int[] ans=obj.getPermutation(a);
			for(int num:ans)
				System.out.print(num+" ");
		}
	}
}