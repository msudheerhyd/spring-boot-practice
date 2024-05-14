package blind75;

public class MergeTwoSortedLists {

    public static void printList(Node head) {
        while(head!=null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static Node mergeLists(Node h1, Node h2) {
        Node head = new Node(0);
        Node dummy = head;

        while(h1!=null && h2!=null) {
            if(h1.data<=h2.data) {
                dummy.next = h1;
                h1 = h1.next;
            }
            else {
                dummy.next = h2;
                h2 = h2.next;
            }
            dummy = dummy.next;
        }
        while(h1 != null) {
            dummy.next = h1;
            h1 = h1.next;
            dummy = dummy.next;
        }
        while(h2 != null) {
            dummy.next = h2;
            h2 = h2.next;
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node m1 = new Node(1);
        Node m2 = new Node(2);
        Node m3 = new Node(3);
        m1.next = m2;
        m2.next = m3;

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node k = mergeLists(m1, n1);
        printList(k);

    }
}
