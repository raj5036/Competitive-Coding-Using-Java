 
import java.io.*; 
import java.util.*; 

// This class represents a directed graph using adjacency list 
// representation 
class Graph3 
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists 

	// Constructor 
	Graph3(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 
		adj[v].add(w); 
    } 
    // public String vowelReplace(String s){
    //     return s.replaceAll("[aeiouAEIOU]","");
    // }
    // public String vowelReplace(String  s){
    //     Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    //     List<Character> vow = Arrays.asList(vowels);
    //     StringBuffer str = new StringBuffer(s);    
    //     for(int i=0;i<str.length();i++){
    //         if(vow.contains(str.charAt(i))){
    //             str.replace(i, i+1, "");
    //             i--;
    //         }
    //     }
    //     return str.toString();
    // }

	// prints BFS traversal from a given source s 
	void BFS(int s) 
	{ 
		// Mark all the vertices as not visited(By default 
		// set as false) 
		boolean visited[] = new boolean[V]; 

		// Create a queue for BFS 
		LinkedList<Integer> queue = new LinkedList<Integer>(); 

		// Mark the current node as visited and enqueue it 
		visited[s]=true; 
		queue.add(s); 

		while (queue.size() != 0) 
		{ 
			// Dequeue a vertex from queue and print it 
			s = queue.poll(); 
			System.out.print(s+" "); 

			// Get all adjacent vertices of the dequeued vertex s 
			// If a adjacent has not been visited, then mark it 
			// visited and enqueue it 
			Iterator<Integer> i = adj[s].listIterator(); 
			while (i.hasNext()) 
			{ 
				int n = i.next(); 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
    } 
    public void DFSUtil(int v,Boolean[] visited){
        visited[v]=true;
        System.out.println(v+"");
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            Integer node = i.next();
            if(!visited[node]){
                visited[node]=true;
                DFSUtil(node, visited);
            }
        }
    }
    public void DFS(int source){
        Boolean[] visited=new Boolean[V];

        DFSUtil(source, visited);
    }

	// Driver method to 
	public static void main(String args[]) 
	{ 
		Graph3 g = new Graph3(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Breadth First Traversal "+ 
						"(starting from vertex 2)"); 

        // g.BFS(2);
        // g.DFS(2); 
        System.out.println(g.vowelReplace("GEEKSFORGEEKS and geeksforgeeks"));
	} 
} 
// This code is contributed by Aakash Hasija 
