import java.util.*;
public class Solution{
	boolean isSafe(List<Integer> c,int num){
		int size=c.size();
		c.add(new Integer(num));
		for(int i=0;i<size-1;i++)
			if(c.get(i)>c.get(i+1))
				return false;
		return true;
	}
	boolean isGoodArray(int[] a){
		List<Integer> b=new ArrayList<>();
		for(int num:a)
			b.add(num);
		List<Integer> c=new ArrayList<>();
		c.add(new Integer(0));
		int i=0,j=b.size()-1;
		while(!b.isEmpty() && i<b.size() && j>=0){
			if(isSafe(c,b.get(i))){
				b.remove(i);
				i++;
				j--;
			}else if(isSafe(c,b.get(j))){
				b.remove(j);
				j--;
			}else
				return false;
		}
		return true;
	}
	int minimumOperation(int[] a,int i){
		if(isGoodArray(a))
			return 0;
		int[] temp=new int[a.length-i];
		int pos=i;
		for(int index=0;index<temp.length;index++)
			temp[index]=a[i++];
		if(isGoodArray(temp))
			return i;
		else
			return minimumOperation(a,pos+1);
	}
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<a.length;i++)
				a[i]=sc.nextInt();
			int i=0;
			System.out.println(obj.minimumOperation(a,i));
		}
	}
}