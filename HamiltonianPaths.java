package Labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HamiltonianPaths {
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
		
		UnweightedGraph<Integer> g = new UnweightedGraph<>(list, numberofvertices);
		System.out.println("Hamiltonian Paths:");
		g.getHamiltonianPaths();
		
	}
}