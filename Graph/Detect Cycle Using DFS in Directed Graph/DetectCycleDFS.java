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
		public boolean detectCycle(Graph graph){
			boolean[] visited=new boolean[graph.V];
			boolean[] recStack=new boolean[graph.V];
			Arrays.fill(visited,false);
			Arrays.fill(recStack,false);
			for(int i=0;i<graph.V;i++){
				if(detectCycleUtil(graph,i,visited,recStack))
					return true;
			}
			return false;
		}
		public boolean detectCycleUtil(Graph graph,int node,boolean[] visited,boolean[] recStack){
			if(recStack[node]) 
                return true; 
              
            visited[node] = true; 
            recStack[node] = true; 
            Iterator<Integer> it=graph.adjList[node].listIterator();
          
            while(it.hasNext()) 
                if (detectCycleUtil(graph ,it.next(), visited, recStack)) 
                    return true; 

             recStack[node] = false;

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
        if(graph.detectCycle(graph))
        	System.out.println("Cycle Exists");
        else
        	System.out.println("No Cycle");
	}
}