import java.util.*;
import java.io.*;
public class DetectCycleDFS{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];

		@SuppressWarnings("unchecked")

		public Graph(int V){
			this.V=V;
			adjList=new LinkedList[V];

			for(int i=0;i<V;i++)
				adjList[i]=new LinkedList();
		}
		void addEdge(Graph graph,int src,int dest){
			graph.adjList[src].add(dest);
			graph.adjList[dest].add(src);
		}
		Boolean detectCycleUsingBFS(Graph graph){
			Boolean[] visited=new Boolean[graph.V];
			Boolean[] recStack=new Boolean[graph.V];
			Arrays.fill(visited,false);
			Arrays.fill(recStack,false);

			for(int i=0;i<graph.V;i++){
				if(detectCycleUsingBFSUtil(graph,i,visited,recStack))
					return true;
			}
			return false;
		}
		Boolean detectCycleUsingBFSUtil(Graph graph,int node,Boolean[] visited,Boolean[] recStack){
			if(recStack[node])
				return true;
			visited[node]=true;
			recStack[node]=true;
			Iterator<Integer> i=graph.adjList[node].listIterator();
			while(i.hasNext()){
				int next=i.next();
				if(detectCycleUsingBFSUtil(graph,next,visited,recStack)){
					return true;
				}
				recStack[node]=false;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Graph graph = new Graph(4); 
        graph.addEdge(graph,0, 1); 
        graph.addEdge(graph,0, 2); 
        graph.addEdge(graph,1, 2); 
        graph.addEdge(graph,2, 0); 
        graph.addEdge(graph,2, 3); 
        graph.addEdge(graph,3, 3); 
        if(graph.detectCycleUsingBFS(graph))
        	System.out.println("Cycle Exists");
        else
        	System.out.println("No Cycle");
	}
}