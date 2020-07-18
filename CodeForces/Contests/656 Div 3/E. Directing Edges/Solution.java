import java.util.*;
class Graph{
	int V,E;
	LinkedList<Integer> adjList[];	

	@SuppressWarnings("unchecked")
	Graph(int N,int M){
		this.V=N;
		this.E=M;
		adjList=new LinkedList[N];
		for(int i=0;i<N;i++)
			adjList[i]=new LinkedList<>();
	}
	boolean addEdge(Graph g,int t,int src,int dest){
		if(t==1){
			g.adjList[src].add(dest);
			return true;
		}
		else{
			g.adjList[src].add(dest);
			if(g.detectCycle(g)){
				g.adjList[src].remove(new Integer(dest));
				g.adjList[dest].add(src);
				if(g.detectCycle(g))
					return false;
			}
		}
		return true;
	}
	boolean detectCycle(Graph g){
		boolean[] visited=new boolean[g.V];
		Arrays.fill(visited,false);
		boolean[] recStack=new boolean[g.V];
		Arrays.fill(recStack,false);
		for(int i=0;i<g.V;i++)
			if(detectCycleUtil(g,i,visited,recStack))
				return true;
		return false;
	}
	boolean detectCycleUtil(Graph g,int node,boolean[] visited,boolean[] recStack){
		if(recStack[node])
			return true;
		visited[node]=true;
		recStack[node] = true;
		Iterator<Integer> it=g.adjList[node].listIterator();
		while(it.hasNext())
			if(detectCycleUtil(g,it.next(),visited,recStack))
				return true;
		recStack[node]=false;
		return false;
	}
	void DFS(Graph g){
		boolean[] visited=new boolean[g.V];
		Arrays.fill(visited,false);
		DFSUtil(g,visited,0);
	}
	void DFSUtil(Graph g,boolean[] visited,int node){
		visited[node]=true;
		System.out.print(node+1+" ");

		Iterator<Integer> it=g.adjList[node].listIterator();
		while(it.hasNext()){
			int next=it.next();
			if(!visited[next])
				DFSUtil(g,visited,next);
		}
	}
}
public class Solution{
	public static void main(String[] args) {
		Solution obj=new Solution();
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		while(testCase-->0){
			int N=sc.nextInt();
			int M=sc.nextInt();
			int count=0;
			Graph g=new Graph(N,M);
			for(int i=0;i<M;i++){
				int t=sc.nextInt();
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				while(g.addEdge(g,t,x,y)){
					count++;
				}
			}
			if(count>=M-1){
				System.out.println("Yes");
				g.DFS(g);
			}else{
				System.out.println("No");
			}
		}
	}
}