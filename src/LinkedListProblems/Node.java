package LinkedListProblems;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    int getData(Node node){
        return node.data;
    }

    Node getNext(Node node){
        return node.next;
    }

    void setNext(Node next){
        this.next = next;
    }
}