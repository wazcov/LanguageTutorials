package graph;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GraphExample {

    static HashMap<String, ArrayList<String>> thegraph = new HashMap<>();

    public static void createGraph() {
        addEdge("London", "Barca");
        addEdge("Barca", "Madrid");
        addEdge("London", "Ottawa");
        addEdge("Madrid", "Ottawa");
    }

    public static void addEdge(String node, String neighbour) {

        ArrayList<String> neighbours = null;

        if (thegraph.containsKey(node)) {
            neighbours = thegraph.get(node);
        } else {
            neighbours = new ArrayList<String>();
        }

        neighbours.add(neighbour);
        thegraph.put(node, neighbours);
    }

    public static void listEdges() {

        ArrayList<ArrayList<String>> edges = new ArrayList<>();

        for(String entry : thegraph.keySet()) {
            edges.add(thegraph.get(entry));
        }

        System.out.println(edges);

    }

    public static void main(String[] args) {
        createGraph();
        listEdges();
    }
}
