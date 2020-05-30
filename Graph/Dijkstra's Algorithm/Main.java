import java.util.*;
class Dijkstra{
	private static int  V=9;
	private int minDistance(int[] dist,boolean[] visited){
		int min=Integer.MAX_VALUE,minIndex=-1;
		for(int i=0;i<V;i++){
			if(dist[i]<=min && !visited[i]){
				min=dist[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	private void printSolution(int src,int[] dist){
		System.out.println("Vertex\t\tDistance of them from the source");
		System.out.println("---------------------------------------------------------");

		for(int i=0;i<V;i++){
			System.out.println(i+"\t\t"+dist[i]);
		}
	}
	private void dijkstra(int[][] graph,int src){
		int[] dist=new int[V];
		boolean[] visited=new boolean[V];
		Arrays.fill(dist,Integer.MAX_VALUE);
		Arrays.fill(visited,false);

		dist[src]=0;
		
		for(int i=0;i<V-1;i++){
			int u=minDistance(dist,visited); //In the first iteration it Always picks the source vertex 
			visited[u]=true;

			for(int v=0;v<V;v++){
				if(!visited[v] && graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v])
					dist[v]=dist[u]+graph[u][v];
			}
		}
		printSolution(src,dist);
	}
	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
		Dijkstra obj=new Dijkstra();
		int src=0;
		obj.dijkstra(graph,src);
	}
}