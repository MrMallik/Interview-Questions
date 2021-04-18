package graphs;

import java.util.ArrayList;

public class PathAvailability {

    public static boolean isConnected(Graph graph, Node src, Node dest){
        ArrayList<Node> nodes = graph.nodes;

        for(Node node : nodes){
            if(node == src) {
                return DFSUtil(src, dest);
            }
        }
        return false; //Return false, if src node is absent in ArrayList
    }

    public static boolean DFSUtil(Node src, Node dest){
        if(src == dest)
            return true;

        src.visited = true;

        for(Node neighbour : src.adjList){
            if(neighbour.visited == false) {
                boolean found = DFSUtil(neighbour, dest);

                if(found)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");

        Graph graph = new Graph(new ArrayList<>());
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);

        graph.addEdge(n1, n2);
        graph.addEdge(n1, n3);
        graph.addEdge(n2, n3);
        //graph.addEdge(n3, n4);
        graph.addEdge(n4, n3);

        System.out.println("Path exists between node-1 and node-4 : " + isConnected(graph,
                n1, n4));
    }
}
