package TreesGraphsProblems;

public class DFS {
    public static void traverse(Node root){
        if(root == null) return;
        System.out.print(root.name + " ");
        root.visited = true;
        for(Node n : root.adjacent){
            if(n.visited == false)
                traverse(n);
        }
    }

    /*public static boolean search(Node root, Node node){
        if(root == null) return false;
        if(root == node) return true;
        root.visited = true;
        for(Node n : root.adjacent){
            if(n.visited == false)
                traverse(n);
        }
    }*/

    public static void main(String args[]){
        Node node1 = new Node("1");
        Node node2 = new Node("25");
        Node node3 = new Node("3");
        Node node4 = new Node("44");
        Node node5 = new Node("5");

        node1.adjacent.add(node2);
        node1.adjacent.add(node3);

        node2.adjacent.add(node1);

        node3.adjacent.add(node4);
        node3.adjacent.add(node5);

        node4.adjacent.add(node3);

        node5.adjacent.add(node3);

        //traverse(node1);
        //System.out.println(search(node1, node5));
    }
}
