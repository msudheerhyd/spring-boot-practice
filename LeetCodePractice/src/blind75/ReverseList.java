package blind75;

public class ReverseList {

    public static ListNode reverseList(ListNode head) {
        ListNode reverse = null, node = head;

        while (node != null) {
            ListNode next = node.next;
            node.next = reverse;
            reverse = node;
            node = next;
        }

        return reverse;
    }

    public static void printList(ListNode node) {
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        ListNode q = new ListNode(3);
        ListNode r = new ListNode(4);

        head.next = p;
        p.next = q;
        q.next = r;

        ListNode k = reverseList(head);
        printList(k);
    }
}
