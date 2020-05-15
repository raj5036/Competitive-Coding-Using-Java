import java.util.*;
public class checkCycle{
	//Using DFS
	static class Graph{
		static int V,E;
		LinkedList<Integer> adjList[];
		@SuppressWarnings("unchecked")
		public Graph(int V){
			this.V=V;
			adjList=new LinkedList[this.V];

			for (int i=0;i<Graph.V ;i++ ) {
				adjList[i]=new LinkedList();
			}
		}
		void addEdge(Graph graph,int src,int dest){
			graph.adjList[src].add(dest);
			graph.adjList[dest].add(src);
		}
		Boolean isCyclic(Graph graph){
			Boolean[] visited=new Boolean[graph.V];
			for(int i=0;i<graph.V;i++)
				visited[i]=false;
			for(int i=0;i<graph.V;i++){
				if(!visited[i]){
					if(isCyclicUtil(graph,i,visited,-1))
						return true;
				}
			}
			return false;
		}
		Boolean isCyclicUtil(Graph graph,int v,Boolean[] visited,int parent){
			visited[v]=true;
			Integer i;
			Iterator<Integer> it=graph.adjList[v].listIterator();
			while(it.hasNext()){
				int node=it.next();
				if(!visited[node]){
					isCyclicUtil(graph,node,visited,v);
					return true;
				}
				if(node!=v)
					return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
	 	Graph g1 = new Graph(5); 
        g1.addEdge(g1,1, 0); 
        g1.addEdge(g1,0, 2); 
        g1.addEdge(g1,2, 1); 
        g1.addEdge(g1,0, 3); 
        g1.addEdge(g1,3, 4); 
        if (g1.isCyclic(g1)) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
  
        Graph g2 = new Graph(3); 
        g2.addEdge(g2,0, 1); 
        g2.addEdge(g2,1, 2); 
        if (g2.isCyclic(g2)) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contains cycle"); 
	}
}