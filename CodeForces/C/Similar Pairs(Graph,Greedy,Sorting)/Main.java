import java.util.*;
public class Main{
	public static boolean doesPairExistsUtil(int[] a,boolean[] visited,int i,int j,int count){
		if(i<a.length && j<a.length){
			if(count==a.length)
				return true;
			if(visited[i])
				return doesPairExistsUtil(a,visited,i+1,j,count);
			if(visited[j])
				return doesPairExistsUtil(a,visited,i,j+1,count);
			if(i!=j && (a[i]%2==a[j]%2 || Math.abs(a[i] - a[j])==1) ){
				visited[i]=true;
				visited[j]=true;
				count+=2;
				return doesPairExistsUtil(a,visited,i+1,j+1,count);
			}else 
				return doesPairExistsUtil(a,visited,i,j+1,count);
		}
		return count==a.length;
	}
	public static boolean doesPairExists(int[] a,int n){
		boolean[] visited = new boolean[n];
		Arrays.fill(visited,false);
		int i=0,j=1,count=0;
		Arrays.sort(a);
		return doesPairExistsUtil(a,visited,i,j,count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			if(doesPairExists(a,n))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t < tc; t++){
            int n = sc.nextInt(), even = 0, one = 0;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for(int i = 0; i < n - 1; i++) {
            	if(arr[i+1] - arr[i] == 1) one++;
            	if(arr[i] % 2 == 0) even++;
            }
            even += arr[n-1] % 2 == 0 ? 1 : 0;
            System.out.println(even % 2 == 0 ? "YES" : one > 0 ? "YES" : "NO");
        }
    }
}