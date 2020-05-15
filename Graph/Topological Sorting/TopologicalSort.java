import java.util.*;
import java.io.*;
public class TopologicalSort{
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
		void topologicalSort(Graph graph){
			Stack<Integer> stack=new Stack<Integer>();
			Boolean[] visited=new Boolean[graph.V];
			Arrays.fill(visited,false);

			for(int i=0;i<graph.V;i++){
				if(!visited[i])
					topologicalSortUtil(graph,i,visited,stack);

			}
			while(!stack.isEmpty())
				System.out.print(stack.pop()+" ");
		}
		void topologicalSortUtil(Graph graph,int node,Boolean[] visited,Stack<Integer> stack){
			visited[node]=true;
			Iterator<Integer> i=graph.adjList[node].listIterator();
			while(i.hasNext()){
				Integer next=i.next();
				if(!visited[next])
					topologicalSortUtil(graph,next,visited,stack);
			}
 			stack.push(new Integer(node));
		}
	}
	public static void main(String[] args) {
		// Create a graph given in the above diagram 
        Graph g = new Graph(6); 
        g.addEdge(g,5, 2); 
        g.addEdge(g,5, 0); 
        g.addEdge(g,4, 0); 
        g.addEdge(g,4, 1); 
        g.addEdge(g,2, 3); 
        g.addEdge(g,3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 

        g.topologicalSort(g);
	}
}