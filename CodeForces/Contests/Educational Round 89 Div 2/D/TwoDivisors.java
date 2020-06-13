import java.util.*;
import java.util.stream.*;
public class TwoDivisors{
	public int getGCD(int a ,int b){
		int gcd =1;
		for(int i=1;i<=a && i<=b ;i++){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		return gcd;
	}
	public List<Integer> getDivisors(int n){
		List<Integer> list=new ArrayList<>();
		for(int i=2;i<n;i++){
			if(n%i==0)
				list.add(i);
		}
		return list;
	}
	public int[] checkForValidPairs(List<Integer> divisors,int n){
		int[] a=new int[divisors.size()];
		Iterator<Integer> it=divisors.listIterator();
		int index=0;
		while(it.hasNext())
			a[index++]=it.next();
		//Arrays.toString(a);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]!=a[j] && getGCD( (a[i]+a[j]),n )==1)
					return new int[]{a[i],a[j]};
			}
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			TwoDivisors obj=new TwoDivisors();
			int[] ans1={},ans2={};
			int index=0;
			for(int i=0;i<a.length;i++){
				List<Integer> divisors=obj.getDivisors(a[i]);
				int[] ans=obj.checkForValidPairs(divisors,a[i]);
				System.out.println(Arrays.toString(ans));
				ans1=new int[a.length];
				ans2=new int[a.length];
				ans1[index]=ans[0];
				ans2[index++]=ans[1];				
			}
			System.out.println(Arrays.toString(ans1));
			System.out.println(Arrays.toString(ans2));
	}
}