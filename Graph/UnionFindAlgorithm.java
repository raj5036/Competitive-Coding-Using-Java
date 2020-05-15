import java.util.*;
public class UnionFindAlgorithm{
	static class Graph{
		int V,E;
		Edge edge[];
		class Edge{
			int src,dest,weight;
		}
		public Graph(int V,int E){
			this.V=V;
			this.E=E;
			edge=new Edge[this.V];
			for (int i=0;i<E;i++) {
				edge[i]=new Edge();
			}
		}
		int find(int[] parents,int i){
			if(parents[i]==-1)
				return i;
			return find(parents,parents[i]);
		}
		int[] makeUnion(int[] parents,int x,int y){
			int xSet=find(parents,x);
			int ySet=find(parents,y);
			parents[xSet]=ySet;
			return parents;
		}
		Boolean isCycle(Graph graph){
			int[] parents=new int[graph.V];
			for(int i=0;i<parents.length;i++)
				parents[i]=-1;
			for(int i=0;i<graph.E;i++){
				int x=graph.find(parents,graph.edge[i].src);
				int y=graph.find(parents,graph.edge[i].dest);
				if(x==y)
					return true;
				graph.makeUnion(parents,x,y);
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Graph graph=new Graph(3,3);
		graph.edge[0].src=0;
		graph.edge[0].dest=1;

		graph.edge[1].src=1;
		graph.edge[1].dest=2;

		graph.edge[2].src=0;
		graph.edge[2].dest=2;

		System.out.println(graph.isCycle(graph));
	}
}