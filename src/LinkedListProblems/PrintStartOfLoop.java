package LinkedListProblems;

public class PrintStartOfLoop {

    public static Node getStartOfLoop(Node head){
        Node slow, fast;
        slow = fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        slow = head;

        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    public static void main(String args[]){
        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

         n3.setNext(n2);
         n5.setNext(n1);

        Node ans = getStartOfLoop(n1);

        if(ans != null)
            System.out.println(ans.data);
        else
            System.out.println("No loop in LinkedList");
    }
}
