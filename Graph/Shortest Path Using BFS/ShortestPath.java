import java.util.*;
import java.io.*;
public class ShortestPath{
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
			LinkedList<Integer> queue=new LinkedList<>();
			Boolean[] visited=new Boolean[graph.V];
			Arrays.fill(visited,false);

			visited[src]=true;
			queue.add(src);

			while(!queue.isEmpty()){
				Integer node=queue.poll();
				System.out.print(node + "->");
				Iterator<Integer> i=graph.adjList[src].listIterator();

				while(i.hasNext()){
					Integer next=i.next();
					if(!visited[next]){
						visited[next]=true;
						queue.add(next);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
	}
}