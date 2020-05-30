import java.util.*;

public class Main{
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
		@SuppressWarnings("unchecked")
		Graph(int V){
			this.V=V;
			adjList=new LinkedList[V];
			for(int i=0;i<V;i++)
				adjList[i]=new LinkedList<>();
		}
		public void addEdge(Graph graph,int src,int dest){
			graph.adjList[src].add(dest);
			graph.adjList[dest].add(src);
		}
		public void printList(Graph graph){
			for(int i=0;i<graph.V;i++){
				System.out.println("Adjacenct Nodes of "+ i+" are :" );
				Iterator<Integer> it=graph.adjList[i].listIterator();
				while(it.hasNext()){
					int node = it.next();
					System.out.print(node+" ");
				}
				System.out.println();
			}
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
			visited[node]=true;
			recStack[node]=true;
			Iterator<Integer> it=graph.adjList[node].listIterator();
			while(it.hasNext()){
				int next=it.next();
				if(!visited[next])
					detectCycleUtil(graph,next,visited,recStack);
				else if(recStack[next])
					return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numCourses=sc.nextInt();
		int[][] prerequisites =new int[numCourses][2];

		for(int i=0;i<prerequisites.length;i++)
			for(int j=0;j<prerequisites[i].length;j++)
				prerequisites[i][j]=sc.nextInt();
		// for(int i=0;i<prerequisites.length;i++)
		// 	for(int j=0;j<prerequisites[i].length;j++)
		// 		System.out.println(prerequisites[i][j]);

		Graph graph = new Graph(numCourses);
		for(int[] a : prerequisites)
			graph.addEdge(graph,a[0],a[1]);
		if(graph.detectCycle(graph))
			System.out.println(false);
		else 
			System.out.println(true);
		//graph.printList(graph);
		// System.out.println(graph.adjList.length);
	}
}
// [
// 	[1,0],
// 	[0,1]
// ]