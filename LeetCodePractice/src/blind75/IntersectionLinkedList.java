package blind75;

import java.util.List;

public class IntersectionLinkedList {



    public static ListNode intersectionLinkedList(ListNode headA, ListNode headB) {
        int x = getLength(headA);
        int y = getLength(headB);

        ListNode shorter = (x < y) ? headA : headB;
        ListNode longer = (x < y) ? headB : headA;

        longer = moveForward(longer, Math.abs(x - y));

        while(shorter != null && shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return shorter;
    }

    private static ListNode moveForward(ListNode head, int steps) {
        ListNode node = head;
        while(steps > 0) {
            node = node.next;
            steps--;
        }
        return node;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        for(ListNode node = head; node!= null; node= node.next) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode m1 = new ListNode(2);
        ListNode n1 = new ListNode(3);
        ListNode o1 = new ListNode(16);
        ListNode p1 = new ListNode(15);
        ListNode q1 = new ListNode(12);

        headA.next = m1;
        m1.next = n1;
        n1.next = o1;
        o1.next = p1;
        p1.next = q1;


        ListNode headB = new ListNode(6);
        ListNode m2 = new ListNode(7);
        ListNode n2 = new ListNode(8);
        ListNode o2 = new ListNode(9);
        ListNode p2 = new ListNode(10);

        headB.next = m2;
        m2.next = n2;
        n2.next = o2;
        o2.next = p2;
        p2.next = o1;

        System.out.println(intersectionLinkedList(headA, headB).val);
    }

}
