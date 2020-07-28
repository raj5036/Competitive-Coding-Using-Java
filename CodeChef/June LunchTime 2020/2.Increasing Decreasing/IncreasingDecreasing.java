import java.util.*;
import java.util.stream.*;
import java.lang.*;
class QuickSort{
	int partition(int[] a,int low,int high){
		int i=low-1;
		int pivot=a[high];
		for(int j=low;j<high;j++){
			if(a[j]<=pivot){
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	void quickSort(int[] a,int low,int high){
		int pivot=partition(a,low,high);
		quickSort(a,low,pivot-1);
		quickSort(a,pivot+1,high);
	}
}
public class IncreasingDecreasing{
	boolean increasingDecreasing(int[] a,int n,int maxRepeatingElement){
		if(n==1)
			return false;
		int max=Arrays.stream(a).max().getAsInt();
		Set<Integer> set=new HashSet<>();
		
		for(int num:a)
			if(!set.contains(num))
				set.add(num);
			else{
				if(num>maxRepeatingElement)
					maxRepeatingElement=num;
			}
		if(maxRepeatingElement==max)
			return false;
		return true; 
	}
	void printArray(int[] a,int n,int maxRepeatingElement){
		if(maxRepeatingElement==Integer.MIN_VALUE){
			QuickSort obj=new QuickSort();
			//obj.quickSort(a,0,n-1);
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
		}else{
			System.out.println("Need Permutation");
		}
	}
	public static void main(String[] args) {
		IncreasingDecreasing obj=new IncreasingDecreasing();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int maxRepeatingElement=Integer.MIN_VALUE;
			if(!obj.increasingDecreasing(a,n,maxRepeatingElement)){
				System.out.println("No");
			}else{
				System.out.println("Yes");
				obj.printArray(a,n,maxRepeatingElement);
			}
		}
	}
}