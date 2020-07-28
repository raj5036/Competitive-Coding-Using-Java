import java.util.*;
public class Solution{
	int getMinSkill(List<Integer> l){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<l.size();i++)
			if(l.get(i)<min)
				min=l.get(i);
		return min;
	}
	int function(List<Integer> list,int x,int noOfTeams){
		int n=list.size();
		if(n==1 && n*getMinSkill(list)>=x)
			return 1;
		return Math.max(function(list.subList(0,n-1),x,noOfTeams),function(list.subList(0,n),x,noOfTeams));
		return noOfTeams;
	}
	public static void main(String[] args){
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int x=sc.nextInt();
			List<Integer> list=new ArrayList<>();
			for(int i=1;i<=n;i++){
				int temp=sc.nextInt();
				list.add(new Integer(temp));
			}
			Collections.sort(list);
			obj.function(list,x);
		}
	}
}