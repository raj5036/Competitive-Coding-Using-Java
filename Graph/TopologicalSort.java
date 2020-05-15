import java.util.*;
import java.io.*;
class TopoLogicalSorting{
	static class Graph{
		int V; //Total no of vertices
		LinkedList<Integer> adj[]; //Adjecency list of vertices
		public Graph(int V){
			this.V=V;
			adj=new LinkedList[V];
			for(int i=0;i<V;i++)
				adj[i]=new LinkedList();
		}
	}
	void addEdge(Graph graph,int src, int dest){
		graph.adj[src].add(dest);
		graph.adj[dest].add(src);
	}
	void printGraph(Graph graph){
		for(int i=0;i<graph.V;i++){
			System.out.println("The Adjecenct vertices of node "+i+" is");
			for(int node : adj[i])
				System.out.print(node + "->");
		}
	}
	void topologicalSort(Graph graph,int src){
		Stack<Integer> stack=new Stack<Integer>();
		Boolean[] visited=new Boolean[graph.V];
		for(int i=0;i<graph.V;i++)
			visited[i]=false;
		for(int i=0;i<graph.V;i++){
			if(!visited[i])
				topologicalSortUtil(graph,i,visited,stack);
		}
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");
	}
	void topologicalSortUtil(Graph graph,int src,Boolean[] visited,Stack<Integer> stack){
		visited[src]=true;
		Iterator<Integer> i=graph.adj[src].listIterator();
		while(i.hasNext()){
			int node=i.next();
			if(!visited[node]){
				topologicalSortUtil(graph,node,visited,stack);
			}
		}
		stack.push(new Integer(v));
	}
}