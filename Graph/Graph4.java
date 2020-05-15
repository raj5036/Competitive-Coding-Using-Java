import java.util.*;
class GraphImp{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
		public Graph(int V){
			this.V=V;
			adjList=new LinkedList[V];
			for(int i=0;i<V;i++){
				adjList[i] =new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph graph,int src,int dest){
		graph.adjList[src].add(dest);
		graph.adjList[dest].add(src);	
	}
	static void printGraph(Graph graph){
		for(int i=0;i<graph.V;i++){
			System.out.println("Adjacent vertices of Node "+ i+" are");
			System.out.print("head");
			for(int node:graph.adjList[i]){
				System.out.print("->"+node);
			}
			System.out.println();
		}		
	}
	static void BFS(Graph graph,int src){
		boolean[] visited = new boolean[graph.V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		visited[src]=true;
		while(queue.size()!=0){
			int s=queue.poll();
			System.out.println(s);
			Iterator<Integer> i = graph.adjList[s].listIterator();
			while(i.hasNext()){
				int node = i.next();
				if(!visited[node]){
					visited[node]=true;
					queue.add(node);
				}
			}
		}
	}
	static void DFS(Graph graph,int src){
		boolean[] visited = new boolean[graph.V];
		DFSUtil(graph,src,visited);
	}
	static void DFSUtil(Graph graph,int src,boolean[] visited){
		visited[src]=true;
		System.out.println(src);
		Iterator<Integer> i = graph.adjList[src].listIterator();
		while(i.hasNext()){
			int node = i.next();
			if(!visited[node])
				DFSUtil(graph,node,visited);
		}
	}
	public static void main(String[] args){
		Graph graph = new Graph(5);
		addEdge(graph,0,1);
		addEdge(graph,0,4);
		addEdge(graph,1,2);
		addEdge(graph,1,3);
		addEdge(graph,1,4);
		addEdge(graph,2,3);
		addEdge(graph,3,4);

		printGraph(graph);
		System.out.println("BFS Traversal starting from node 2");
		BFS(graph,2);

		System.out.println("DFS Traversal starting from node 0 ");
		DFS(graph,0);
	}
}