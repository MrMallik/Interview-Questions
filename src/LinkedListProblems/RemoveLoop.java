package LinkedListProblems;

public class RemoveLoop {
    public static Node removeLoop(Node head){
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

        //fast is the start of the loop

        Node prev = fast;
        Node curr = fast.next;

        while(curr != fast){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = null;

        return head;
    }

    public static void main(String args[]){
        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        n3.setNext(n2);
        n5.setNext(n1);

        System.out.println("Cycle? : " + CycleDetection.detectCycle(n1));
        n1 = removeLoop(n1);
        System.out.println("Cycle? : " + CycleDetection.detectCycle(n1));
    }
}
