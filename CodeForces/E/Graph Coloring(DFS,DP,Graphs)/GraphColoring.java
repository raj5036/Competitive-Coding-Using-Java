import java.util.*;
class Graph{
	int V,E;
	LinkedList<Integer> adjList[];

	public Graph(int V,int E){
		this.V=V;
		adjList=new LinkedList[V+1];
		for(int i=0;i<=V;i++)
			adjList[i]=new LinkedList();
	}
	void addEdge(Graph graph,int src,int dest){
		graph.adjList[src].add(dest);
		graph.adjList[dest].add(src);
	}
	int[] greedyColoring(Graph graph,int n1,int n2,int n3){
		boolean[] available=new boolean[3]; // 0 1 2 
		Arrays.fill(available,true); //Initially all colors are available 
		int[] result=new int[graph.V];
		Arrays.fill(result,-1); //-1 suggests : no colors have been assigned to the iTh vertex
		result[0]= 0; //assign first color to first vertex
		for(int i=1;i<graph.V;i++){

			Iterator<Integer> it=graph.adjList[i].listIterator();
			while(it.hasNext()){
				int node=it.next();
				if(result[node]!=-1)
					available[result[node]]= false;
			}

			int color=-1;
			for(int cr=0;cr<available.length;cr++){
				if(available[cr]){
					color=cr;
					break;
				}
			}

			result[i]=color;
			if(color==0) n1--;
			else if(color==1) n2--;
			else if(color==2) n3--;
			Arrays.fill(available, true);
		}
		return result;
	}
}
public class GraphColoring{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		int E=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		Graph graph = new Graph(V,E);
		for(int i=0;i<E;i++){
			int u=sc.nextInt();
			int v=sc.nextInt();;
			graph.addEdge(graph,u,v);
		}
		int[] result=graph.greedyColoring(graph,n1,n2,n3);
		if(n1!=0 || n2!=0 || n3!=0){
			System.out.println("No");
			for(int i=0;i<result.length;i++)
				System.out.print(result[i]+1);
		}
		else{
			for(int i=0;i<result.length;i++)
				System.out.print(result[i]+1);
		}
	}
}