
package Tutor8;

import java.util.ArrayList;

public class GraphUsing {
    public static void main(String[] args) {
        Graph g = new Graph();
        g = g.loadFromFile1("graph.txt");
        System.out.println(g.toString());
        ArrayList<Edge> edges = g.depthFirstSearch();
        System.out.println("Deep First Search");
        g.printEdges(edges, System.out);
        edges = g.breadthFirstSearch();
        System.out.println("Breadth First Search");
        g.printEdges(edges, System.out);
    }
}
