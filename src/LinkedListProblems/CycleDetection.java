package LinkedListProblems;

public class CycleDetection {

    public static void printList(Node ptr){
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public static boolean detectCycle(Node head){
        Node slow, fast;
        slow = fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        //n5.setNext(n1); //created a loop


        /*if(detectCycle(n1))
            System.out.println("Loop Detected!");
        else
            System.out.println("No Loop Detected!");*/

        printList(n1);


    }
}
