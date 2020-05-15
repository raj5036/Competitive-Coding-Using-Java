import java.util.*;
class GraphCycle{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
		public Graph(int V){
			this.V=V;
			adjList=new LinkedList[V];
			for(int i=0;i<V;i++){
				adjList[i]=new LinkedList<>();
			}
		}
		void addEdge(Graph graph,int src,int dest){
			graph.adjList[src].add(dest);
			graph.adjList[dest].add(src);
		}
		void printGraph(Graph graph){
			for(int i=0;i<graph.V;i++){
				System.out.println("The adjecnt nodes of vertex "+ i+" are");
				System.out.print("head");
				for(int node:graph.adjList[i]){
					System.out.print("->"+node);
				}
				System.out.println();
			}
		}
		boolean isCyclicUtil(Graph graph,int v,Boolean[] visited,int parent){
			visited[v]=true;
			int i;
			Iterator<Integer> it = graph.adjList[v].listIterator();
			while(it.hasNext()){
				i=it.next();
				if(!visited[i]){
					if(isCyclicUtil(graph,i,visited,v)){
						return true;
					}
				}else if(visited[i] && i!=parent) return true;
			}
			return false;
		}
		boolean isCyclic(Graph graph){
			Boolean[] visited=new Boolean[graph.V];
			for(int i=0;i<V;i++)
				visited[i]=false;
			for(int v=0;v<graph.V;v++){
				if(!visited[v]){
					if(isCyclicUtil(graph,v,visited,-1)){
						return true;
					}
				}
			}
			return false;
		}
			void DFSUtil(Graph graph,Boolean[] visited,int src){
			visited[src]=true;
			System.out.println(src);
			Iterator<Integer> it=graph.adjList[src].listIterator();
			while(it.hasNext()){
				int node=it.next();
				if(!visited[node])
					DFSUtil(graph,visited,node);
			}
		}

		void DFS(Graph graph,int src){
			Boolean[] visited=new Boolean[graph.V];
			for(int i=0;i<graph.V;i++)
				visited[i]=false;
			DFSUtil(graph,visited,src);
		}
	}
	public static void main(String[] args) {

		Graph graph = new Graph(5); 
        graph.addEdge(graph,1, 0); 
        graph.addEdge(graph,0, 2); 
        graph.addEdge(graph,2, 1); 
        graph.addEdge(graph,0, 3); 
        graph.addEdge(graph,3, 4);

        graph.printGraph(graph); 

        if(graph.isCyclic(graph)) System.out.println("Graph contains cycle");
        else System.out.println("Graph has no cycle");

        System.out.println("DFS Traversal from 2");
        graph.DFS(graph,2);
	}
}