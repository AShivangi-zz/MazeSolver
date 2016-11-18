package agarwalNguyen.cs146.project3;

public class GraphTest {
	public static void main(String[] args)
	{
	Graph theGraph = new Graph();
	theGraph.addVertex('A'); // 0 (start for dfs)
	theGraph.addVertex('B'); // 1
	theGraph.addVertex('C'); // 2
	theGraph.addVertex('D'); // 3
	theGraph.addVertex('E'); // 4
	theGraph.addEdge(0, 1); // AB
	theGraph.addEdge(1, 2); // BC
	theGraph.addEdge(0, 3); // AD
	theGraph.addEdge(3, 4); // DE
	System.out.print("Visits using dfs: ");
	theGraph.dfs(); // depth-first search
	System.out.println();
	System.out.print("Visits usinf bfs: ");
	theGraph.bfs(); // breadth-first search
	System.out.println();
	}

}
