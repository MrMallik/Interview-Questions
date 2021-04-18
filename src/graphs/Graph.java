package graphs;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;

    public Graph(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(Node src, Node dest){
        for(Node node : this.nodes){
            if(node == src)
                src.adjList.add(dest); //add dest to adjList of src
        }
    }
}
