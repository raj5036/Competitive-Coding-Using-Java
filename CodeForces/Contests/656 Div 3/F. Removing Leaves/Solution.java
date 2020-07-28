import java.util.*;
class Graph{
	int V;
	LinkedList<Integer> adjList[];
	@SuppressWarnings("unchecked")
	Graph(int V){
		this.V=V;
		adjList=new LinkedList[V+1];
		for(int i=1;i<=V;i++)
			adjList[i]=new LinkedList<>();
	}
	void addEdge(Graph g,int src,int dest){
		g.adjList[src].add(dest);
		g.adjList[dest].add(src);
	}
}
public class Solution{
	void move(Graph g,int k,int currentNode){
		int removeCount=0;
		for(int i=1;i<g.V;i++){
			if(removeCount>=k)
				break;
			if(g.adjList[i].size()==1 && g.adjList[i].peek()==currentNode){
				g.adjList[i].poll();
				g.adjList[currentNode].remove(new Integer(i));
				removeCount++;
			}
		}
		// for(int i=1;i<g.V;i++)
		// 	System.out.println(Arrays.toString(g.adjList[i].toArray()));
	}
	void function(Graph g,int k,int moves){
		int countOfLeaves=0;
		for(int i=1;i<g.V;i++)
			if(g.adjList[i].size()==1)
				countOfLeaves++;
		if(countOfLeaves<k){
			System.out.println(moves);
			return;
		}
		int currentNode=-1;
		
		for(int i=1;i<g.V;i++){
			if(g.adjList[i].size()==1){
				
				currentNode=g.adjList[i].peek();
				//System.out.println("currentNode "+ currentNode);
				break;
			}
		}	
		move(g,k,currentNode);
		moves++;
		function(g,k,moves);
			
	}
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			Graph g=new Graph(n);
			for(int i=1;i<=n-1;i++){
				int src=sc.nextInt();
				int dest=sc.nextInt();
				g.addEdge(g,src,dest);
			}
			// for(int i=1;i<g.V;i++)
			// 	System.out.println(Arrays.toString(g.adjList[i].toArray()));
			obj.function(g,k,0);
		}
	}
}