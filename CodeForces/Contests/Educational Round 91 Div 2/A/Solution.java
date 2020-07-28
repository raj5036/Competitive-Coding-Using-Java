import java.util.*;
import java.util.stream.*;
public class Solution{
	void function(List<Integer> list,int j){
		int n=list.size();
		if(j==n-1){
			System.out.println("NO");
			return;
		}
		int start=0,end=n-1;
		boolean combinationFound=false;
		while(start<j && end>j){
			if(list.get(start)<list.get(j) && list.get(j)>list.get(end)){
				int i=start+1;
				j=j+1;
				int k=end+1;
				System.out.println("YES");
				System.out.println(i+" "+j+" "+k);
				combinationFound=true;
				break;
			}
			start++;
			end--;
		}
		if(!combinationFound)
			function(list,j+1);
	}
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			List<Integer> list=new ArrayList<>();
			for(int i=1;i<=n;i++){
				int temp=sc.nextInt();
				list.add(new Integer(temp));
			}
			int j=1;
			obj.function(list,j);
		}
	}
}