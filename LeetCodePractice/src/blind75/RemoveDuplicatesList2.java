package blind75;

public class RemoveDuplicatesList2 {

    public static ListNode removeDuplicates(ListNode head) {
        ListNode sHead = new ListNode(0), sTail = sHead, node = head;

        while(node != null) {
            while(node.next != null && node.val == node.next.val) {
                node = node.next;
            }

            ListNode next = node.next;
            node.next = null;
            sTail.next = node;
            sTail = node;
            node = next;
        }
        return sHead.next;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode m = new ListNode(2);
        ListNode n = new ListNode(2);
        ListNode o = new ListNode(3);
        ListNode p = new ListNode(4);

        head.next = m;
        m.next = n;
        n.next = o;
        o.next = p;

        ListNode k = removeDuplicates(head);
        printList(k);
    }
}
