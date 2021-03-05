package TreesGraphsProblems;

import java.util.ArrayList;

public class Node {
    protected String name;
    protected ArrayList<Node> adjacent;
    protected boolean visited;

    Node(String name){
        this.name = name;
        this.visited = false;
        adjacent = new ArrayList<>();
    }

    Node(String name, ArrayList<Node> adjacent){
        this.name = name;
        this.adjacent = (ArrayList<Node>) adjacent.clone();
        this.visited = false;
    }
}
