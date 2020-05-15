import java.util.*;

class Graph{
	static class Edge{
		int src,dest,weight;
		Edge(){
			this.src=this.dest=this.weight=0;
		}
	}
	int V,E;
	Edge[] edge;
	Graph(int v,int e){
		this.V=v;
		this.E=e;
		for(int i=0;i<e;++i)
			edge[i]=new Edge();
	}
	public boolean BellmanFord(Graph graph,int src){
		final int INF=Integer.MAX_VALUE;

		int[] dist=new int[graph.V];
		Arrays.fill(dist,INF);
		dist[src]=0;

		for(int i=1;i<graph.V;++i){
			for(int j=0;j<E;++j){
				int u=graph.edge[j].src;
				int v=graph.edge[j].dest;
				int weight=graph.edge[j].weight;
				if(dist[u]!=INF && dist[u]+weight<dist[v])
					dist[v]=dist[u]+weight;
			}
		}

		for(int i=0;i<E;i++){
				int u=graph.edge[i].src;
				int v=graph.edge[i].dest;
				int weight=graph.edge[i].weight;
				if(dist[u]!=INF && dist[u]+weight<dist[v])
					return true;
		}
		return false;
	}
	public static void main(String[] args) {
	 	int V = 5; 
        int E = 8; 
  
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

        System.out.println(graph.BellmanFord(graph,0));
	}
}
