import java.util.*;
import java.io.*;
public class CheckCycleBFS{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
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
		void BFS(Graph graph,int src){
			Boolean[] visited=new Boolean[graph.V];
			Arrays.fill(visited,false);
			LinkedList<Integer> queue=new LinkedList<Integer>();
			visited[src]=true;
			queue.add(src);
			while(!queue.isEmpty()){
				int node=queue.poll();
				System.out.println(node);
				Iterator<Integer> i=graph.adjList[node].listIterator();
				while(i.hasNext()){
					int next=i.next();
					if(!visited[next]){
						visited[next]=true;
						queue.add(next);
					}
				}
			}
		}
		
		void checkCycleUsingBFS(Graph graph){
			Boolean[] visited=new Boolean[graph.V];
			Arrays.fill(visited,false);
			for(int i=0;i<graph.V;i++){
				if(checkCycleUsingBFSUtil(graph,i,visited)){
					System.out.println("Cycle Exists");
					break;
				}
				else
					System.out.println("Cycle Doesn't Exist");
			}
		}
	}
		Boolean checkCycleUsingBFSUtil(Graph graph,int src,Boolean[] visited){
			int[] parent=new int[graph.V];
			visited[src]=true;
			Arrays.fill(parent,-1);
			LinkedList<Integer> queue=new LinkedList<Integer>();
			queue.add(src);
			while(!queue.isEmpty()){
				int node=queue.poll();
				Iterator<Integer> i=graph.adjList[node].listIterator();
				while(i.hasNext()){
					int next=i.next();
					if(!visited[next]){
						visited[next]=true;
						queue.add(next);
						parent[next]=node;
					}else if(parent[next]!=node){
						return true;
					}
				}
			}
			return false;
		}
	public static void main(String[] args) {
		
		Graph g = new Graph(4); 

		g.addEdge(g,0, 1); 
		g.addEdge(g,0, 2); 
		g.addEdge(g,1, 2); 
		g.addEdge(g,2, 0); 
		g.addEdge(g,2, 3); 
		g.addEdge(g,3, 3); 

		System.out.println("BFS From 2");

		g.BFS(g,2);
		g.checkCycleUsingBFS(g);
	}
}