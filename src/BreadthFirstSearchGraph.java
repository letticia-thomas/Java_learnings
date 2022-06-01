import java.util.*;
public class BreadthFirstSearchGraph extends Graph {
	
	BreadthFirstSearchGraph(int vertex){
		super(vertex);
	}
	
	LinkedList<Integer> queue = new LinkedList<Integer>();
	
	public void BreadthFirst(int vert)
	{
		System.out.println(vert);
		visited[vert]=true;
		Iterator<Integer> it = adj[vert].iterator();
		while(it.hasNext())
		{
			int n= it.next();
			if(!visited[n])
			queue.add(n);
		}
		if(!queue.isEmpty())
		{
			int next = queue.poll();
			BreadthFirst(next);
		}
	}
	
	public static void main(String[] args)
	{
		BreadthFirstSearchGraph bfs = new BreadthFirstSearchGraph(4);
		bfs.addVertex(0,1);
		bfs.addVertex(0,2);
		bfs.addVertex(1,3);
		bfs.BreadthFirst(0);
	}
}
