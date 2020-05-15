import java.util.*;
public class BFSDirectedCycle{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
		@SuppressWarnings("unchecked")
		public Graph(int V){
			this.V=V;
			adjList=new LinkedList[V];

			for(int i=0;i<this.V;i++)
				adjList[i]=new LinkedList();
		}
		void addEdge(Graph graph,int src,int dest){
			graph.adjList[src].add(dest);
			graph.adjList[dest].add(src);
		}
		Boolean detectCycleUsingBFS(Graph graph){
			int[] inDegree=new int[graph.V];
			Arrays.fill(inDegree,0);

			for(int i=0;i<graph.V;i++){
				for(int v : graph.adjList[i])
					inDegree[v]++;
			}
		}
	}
	public static void main(String[] args) {
		
	}
}