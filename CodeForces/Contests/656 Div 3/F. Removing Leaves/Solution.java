import java.util.*;
class Graph{
	int V;
	LinkedList<Integer> adjList[];
	@SuppressWarnings("unchecked")
	Graph(int V){
		this.V=V;
		adjList=new LinedList[n];
		for(int i=0;i<V;i++)
			adjList[i]=new LinkedList<>();
	}
	void addEdge(Graph g,int src,int dest){
		g.adjList[src].add(dest);
		g.adjList[dest].add(src);
	}
}
public class Solution{
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			for(int i=1;i<=n-1;i++){
				int src=sc.nextInt();
				int dest=sc.nextInt();
				
			}
		}
	}
}