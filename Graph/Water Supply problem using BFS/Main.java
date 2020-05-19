import java.util.*;

class Graph{
	int V;
	LinkedList<Integer> adjList[];
	@SuppressWarnings("unchecked")
	Graph(int V){
		this.V=V;
		for(int i=0;i<this.V;i++)
			adjList[i]=new LinkedList();
	}
	void addEdge(Graph graph,int src,int dest){ /*7
												1 2
												2 3
												3 4
												4 5
												5 6
												6 7
												0 1 1 0 0 0 0*/
		graph.adjList[src].add(dest);
		graph.adjList[dest].add(src);
	}
	int maximumNoOfCities(Graph graph,int[] blockedCities){
		int max=-1;
		LinkedList queue=new LinkedList();
		int src=-1;
		boolean[] visited=new boolean[graph.V];
		Arrays.fill(visited,false);
		for(int i=0;i<blockedCities.length;i++)
			if(blockedCities[i]==0)
				src=blockedCities[i];
		queue.add(src);
		visited[src]=true;
		while(!queue.isEmpty()){
			int node=(int)queue.poll();
			max++;
			Iterator i=graph.adjList[node].listIterator();
			while(i.hasNext()){
				int next=(int)i.next();
				if(!visited[next] && blockedCities[next]==0){
					queue.add(next);
					visited[next]=true;
				}
			}
		}
		return max;
	}
}
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cities=sc.nextInt();
		Graph graph=new Graph(cities);
		for(int road=1;road<cities;road++){
			int src=sc.nextInt();
			int dest=sc.nextInt();
			graph.addEdge(graph,src,dest);
		}
		int[] blockedCities=new int[cities];
		for(int city=1;city<=cities;city++)
			blockedCities[city]=sc.nextInt();
		System.out.println(graph.maximumNoOfCities(graph,blockedCities));
	}
}