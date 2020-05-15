import java.util.*;

public class Main{
	public static int maximumSumSubArray(int[] a){
		int max=Arrays.stream(a).max().getAsInt();
		if(max<0)
			return max;
		int maxSoFar=0;
		int maxAtEnding=0;

		for(int num : a){
			maxSoFar += num;
			maxSoFar=Integer.max(maxSoFar,0);//Check For Negatives
			maxAtEnding=Integer.max(maxAtEnding,maxSoFar);//Update the final result
		}
		return maxAtEnding;
	}
	public static void main(String[] args) {
		int[] a={2,1,3,-3,-7,1,9,5};
		int maxSum=maximumSumSubArray(a);
		System.out.print(maxSum);
	}
}