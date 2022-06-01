import java.util.*;


public class DepthFirstSearchGraph extends Graph{
	DepthFirstSearchGraph(int vertex)
	{
		super(vertex);
	}
	public void DepthFirst(int vert)
	{
		visited[vert] = true;
		System.out.println(vert);
		Iterator<Integer> it = adj[vert].iterator();
		while(it.hasNext())
		{
			int n = it.next();
			if (!visited[n])
			{
				DepthFirst(n);
			}
		}
	}
	
	public static void main(String[] args) {
		DepthFirstSearchGraph dfs = new DepthFirstSearchGraph(4);
		dfs.addVertex(0,1);
		dfs.addVertex(0,2);
		dfs.addVertex(1,3);
		dfs.DepthFirst(0);
	//	dfs.printList();

}

	}
