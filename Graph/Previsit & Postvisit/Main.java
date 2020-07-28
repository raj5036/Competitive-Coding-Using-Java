import java.util.*; 
public class GFG { 

	// Variable to keep track of time 
	static int time = 1; 

	// Function to perform DFS starting from node u 
	static void dfs(int u, ArrayList<ArrayList<Integer> > aList, 
					int pre[], int post[], int vis[]) 
	{ 

		// Storing the pre number whenever 
		// the node comes into recursion stack 
		pre[u] = time; 

		// Increment time 
		time++; 
		vis[u] = 1; 
		for (int v : aList.get(u)) { 
			if (vis[v] == 0) 
				dfs(v, aList, pre, post, vis); 
		} 

		// Storing the post number whenever 
		// the node goes out of recursion stack 
		post[u] = time; 
		time++; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 

		// Number of nodes in graph 
		int n = 6; 

		// Adjacency list 
		ArrayList<ArrayList<Integer> > aList 
			= new ArrayList<ArrayList<Integer> >(n + 1); 
		for (int i = 1; i <= n; i++) { 
			ArrayList<Integer> list = new ArrayList<>(); 
			aList.add(list); 
		} 
		aList.add(new ArrayList<Integer>()); 
		int pre[] = new int[n + 1]; 
		int post[] = new int[n + 1]; 

		// Visited array 
		int vis[] = new int[n + 1]; 

		// Edges 
		aList.get(1).add(2); 
		aList.get(2).add(1); 
		aList.get(2).add(4); 
		aList.get(4).add(2); 
		aList.get(1).add(3); 
		aList.get(3).add(1); 
		aList.get(3).add(4); 
		aList.get(4).add(3); 
		aList.get(3).add(5); 
		aList.get(5).add(3); 
		aList.get(5).add(6); 
		aList.get(6).add(5); 

		// DFS starting at Node 1 
		dfs(1, aList, pre, post, vis); 

		// Number of nodes in graph 
		for (int i = 1; i <= n; i++) 
			System.out.println("Node " + i + " Pre number "
							+ pre[i] + " Post number " + post[i]); 
	} 
} 
