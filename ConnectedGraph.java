package Labs;

import java.io.*;
import java.util.*;

public class ConnectedGraph {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Enter file name:");
		Scanner filenameSC = new Scanner(System.in);
		String filename = filenameSC.nextLine();
		
		Scanner graphSC = new Scanner(new File(filename));
		int numberofvertices = graphSC.nextInt();
		System.out.println("The number of vertices is " + numberofvertices);
		
		List<AbstractGraph.Edge> list = new ArrayList<>();
		String s = graphSC.nextLine();
		while(graphSC.hasNext()) {
			s = graphSC.nextLine();
			String[] tokens = s.split("[\\s+]");
			int u = Integer.parseInt(tokens[0]);
			for(int i = 1; i < tokens.length; i++) {
				int v = Integer.parseInt(tokens[i]);
				list.add(new AbstractGraph.Edge(u, v));
			}
		}
		
		Graph<Integer> g = new UnweightedGraph<>(list, numberofvertices);
		g.printEdges();
		AbstractGraph<Integer>.Tree tree = g.dfs(0);
		System.out.print("The graph is ");
		if(tree.getNumberOfVerticesFound() == numberofvertices)
			System.out.println("connected");
		else
			System.out.println("not connected");
	}
}
