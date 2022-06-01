import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	int vertex;
	LinkedList<Integer>[] adj;
	boolean[] visited;
	Graph(int vertex){
		this.vertex = vertex;
		this.adj = new LinkedList[vertex];
		this.visited = new boolean[vertex];
		for(int i=0;i<vertex;i++)
		{
			adj[i] = new LinkedList();
		}
	}
	public void addVertex(int vet, int edge)
	{
		adj[vet].add(edge);
		
	}
	public void printList()
	{
		for(int i=0;i<vertex;i++)
		{
			System.out.println(i);
			Iterator<Integer> it = adj[i].listIterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
	
	
}
