import java.util.*;

class Graph{
	int V;
	LinkedList<Integer> adjList[];
	@SuppressWarnings("unchecked")
	Graph(int V){
		this.V=V;
		adjList=new LinkedList[V];
		for(int i=0;i<V;i++)
			adjList[i]=new LinkedList();
	}
	void addEdge(Graph graph,int src,int dest){
		graph.adjList[src].add(dest);
		graph.adjList[dest].add(src);
	}
}
public class Main{
	public static void checkOtherIndexesAndDelete(Graph graph,int leaf){
		for(int i=0;i<graph.V;i++){
			if(graph.adjList[i].contains(leaf)) graph.adjList[i].remove(leaf);
		}
	}
	public static void game(Graph graph,int n,int x,int turn){
		for(int i=0;i<graph.V;i++){
			if(graph.adjList[i].size()==2){ 
				/*delete The Entire List In That Index*/
				int leaf=graph.adjList[i].get(0);
				graph.adjList[i].clear();
				checkOtherIndexesAndDelete(graph,leaf);
				turn++;
				return;
			}
		}
	}
	public static boolean winner(Graph graph,int n,int x,int turn){
		int xIndex=0;
		for(int i=0;i<graph.V;i++){
			if(graph.adjList[i].get(0)==x)
				xIndex=i;
		}
		if(graph.adjList[xIndex].size()==2) return turn%2==0;
		else game(graph,n,x,turn);
		return turn%2== 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();

		for(int index=0;index<testCase;index++){
			int n=sc.nextInt();
			int x=sc.nextInt();
			Graph graph = new Graph(n);
			for(int i=0;i<n-1;i++){
				int src=sc.nextInt();
				int dest=sc.nextInt();
				graph.addEdge(graph,src,dest);
			}
			int turn=0;
			System.out.println(winner(graph,n,x,turn)?"Ashish":"Ayush");
		}
	}
}