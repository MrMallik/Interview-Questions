package graphs;

import java.util.ArrayList;

public class Node {
    protected String name;
    protected boolean visited;
    protected  boolean explored;
    protected ArrayList<Node> adjList;

    public Node(String name) {
        this.name = name;
        this.visited = false;
        this.explored = false;
        this.adjList = new ArrayList<>();
    }
}
