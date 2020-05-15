import java.util.*;
public class BellmanFord{
	static class Graph{
		int V;
		int E;
		int[] edge=new int[this.V];
		static class Edge{
			int src,dest,weight;
			public Edge(){
				int src=dest=weight=0;
			}
		}
		public Graph(int V,int E){
			this.V=V;
			this.E=E;
			edge=new int[E];
			for(int i=0;i<E;i++){
				edge[i]=new Edge();
			}	
		}
	}
	static void BellmanFordUtil(Graph graph,int src){
		int[] dist=new dist[graph.V];
		for(int i=0;i<graph.V;i++){
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		//Relaxation Process
		for(int i=0;i<graph.V;++i){
			for(int j=0;j<graph.E;++j){
				int u=graph.edge[j].src;
				int v=graph.edge[j].dest;
				int weight=graph.edge[j].weight;
				if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+weight){
					dist[v]=dist[u]+weight;
				}
			}
		}
		//Negative cycle check
		for(int i=0;i<graph.E;i++){
			int u=graph.edge[i].src;
			int v=graph.edge[i].dest;
			int weight=graph.edge[i].weight;
			if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+weight){
				System.out.println("The graph contains negative edge cycle");
				return;
			}
		}
	}
	public static void main(String[] args){
		int V = 5; // Number of vertices in graph 
       		 int E = 8; // Number of edges in graph 
  
      		  Graph graph = new Graph(V, E); 
  
       		 // add edge 0-1 (or A-B in above figure) 
       		 graph.edge[0].src = 0; 
       		 graph.edge[0].dest = 1; 
       		 graph.edge[0].weight = -1; 
  
        // add edge 0-2 (or A-C in above figure) 
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 4; 
  
        // add edge 1-2 (or B-C in above figure) 
        graph.edge[2].src = 1; 
        graph.edge[2].dest = 2; 
        graph.edge[2].weight = 3; 
  
        // add edge 1-3 (or B-D in above figure) 
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 2; 
  
        // add edge 1-4 (or A-E in above figure) 
        graph.edge[4].src = 1; 
        graph.edge[4].dest = 4; 
        graph.edge[4].weight = 2; 
  
        // add edge 3-2 (or D-C in above figure) 
        graph.edge[5].src = 3; 
        graph.edge[5].dest = 2; 
        graph.edge[5].weight = 5; 
  
        // add edge 3-1 (or D-B in above figure) 
        graph.edge[6].src = 3; 
        graph.edge[6].dest = 1; 
        graph.edge[6].weight = 1; 
  
        // add edge 4-3 (or E-D in above figure) 
        graph.edge[7].src = 4; 
        graph.edge[7].dest = 3; 
        graph.edge[7].weight = -3; 
  
        graph.BellmanFordUtil(graph, 0);
	}
}