import java.util.*;

class Graph{
	int V,E;
	class Edge{
		int src,dest;
	}
	Edge[] edge;

	@SuppressWarnings("unchecked")

	Graph(int V,int E){
		this.V=V;
		this.E=E;
		edge=new Edge[this.E];
		for(int i=0;i<this.E;i++)
			edge[i]=new Edge();
	}
	int find(int[] parent,int i){
		if(parent[i]==-1)
			return i;
		return find(parent,parent[i]);
	}
	void union(int[] parent,int x,int y){
		int xSet=find(parent,x);
		int ySet=find(parent,y);
		parent[xSet]=ySet;
	}
	boolean detectCycle(Graph graph){
		int[] parent=new int[graph.V];
		Arrays.fill(parent,-1);

		for(int i=0;i<graph.E;i++){
			int source=graph.edge[i].src;
			int destination=graph.edge[i].dest;
			if(graph.find(parent,source)==graph.find(parent,destination))
				return true;
			graph.union(parent,source,destination);
		}
		return false;
	}
	public static void main(String[] args) {
		final int V = 3;
		final int E = 3; 
        Graph graph = new Graph(V, E); 
  
        // add edge 0-1 
        graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
  
        // add edge 1-2 
        graph.edge[1].src = 1; 
        graph.edge[1].dest = 2; 
  
        // add edge 0-2 
        graph.edge[2].src = 0; 
        graph.edge[2].dest = 2; 
  
        if (graph.detectCycle(graph)) 
            System.out.println( "graph contains cycle" ); 
        else
            System.out.println( "graph doesn't contain cycle" ); 
	}
}
