package LinkedListProblems;

public class ReverseLinkedList {
    public static Node reverseBetween(Node head, int m, int n) {
        Node prev = null, curr = head, next = null, temp;
        int i;

        if(head == null) return null;

        for(i = 1; i < m-1; i++)
            prev = prev.next;

        temp = prev;

        prev = prev.next;

        if(prev.next != null){

            curr = prev.next;

            for(i = m + 1; i <= n; i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            temp.next.next = curr;
            temp.next = prev;
        }

        else{
            head = prev;
            prev.next = temp;
            temp.next = null;
        }

        return head;
    }

    public static void main(String args[]){
        //Node n4 = new Node(4);
        //Node n3 = new Node(3, n4);
        Node n2 = new Node(2);
        Node n1 = new Node(1, n2);

        Node head = reverseBetween(n1, 1, 2);
        CycleDetection.printList(head);
    }
}
