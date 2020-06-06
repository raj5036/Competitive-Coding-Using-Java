import java.util.*;
import java.util.stream.*;

public class LongestSubsequence{
	public int maxLength(int[] a){
		int n=a.length,len=0;
		Arrays.sort(a); // 0 1 2 3 7 8 10 
		for(int i=0;i<n-1;i++){
			if(Math.abs(a[i] - a[i+1])==1){ 
				System.out.println(len);
				len++;
			}
			if(len>1 && Math.abs(a[i] - a[i+1])!=1)
				break;
		}
		if(len>1)
			len+=1;
		return len;
	}
	public int findMaxLenSubseq(int[] a){
		@SuppressWarnings("unchecked")
		//Set<Integer> set= new HashSet(Arrays.asList(a));
		Set<Integer> s=IntStream.of(a).boxed().collect(Collectors.toSet());
		int maxLen=0;
		for(int e : a){
			if(!s.contains(e-1)){
				int len=1;
				while(s.contains(e+len))
					len++;
				maxLen=Math.max(maxLen,len);
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		LongestSubsequence obj=new LongestSubsequence();
		int[] a={212,0,7,1,8,3,10,4}; //2 0 1 3
		System.out.println(obj.findMaxLenSubseq(a));
	}
}