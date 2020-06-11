import java.util.*;
import java.util.stream.*;

public class LongestAlternatingSubArray{
	public int longestSubArray(int[] a){
		int count=0,n=a.length,maxLength=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(count,0);
		for(int i=0;i<n;i++){
			if(a[i]>0) count+=1;
			else count-=1;
			if(!map.containsKey(count)){
				map.put(count,i);
			}else{
				maxLength=Math.max(maxLength,i-map.get(count));
			}
		}
		return maxLength;
	}
	public static void main(String[] args) {
		int[] a={1,2,3,4,-2,9,-1};
		LongestAlternatingSubArray obj=new LongestAlternatingSubArray();
		System.out.println(obj.longestSubArray(a));
	}
}