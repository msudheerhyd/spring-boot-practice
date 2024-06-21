package blind75;

public class DeleteNode {

    public static ListNode deleteNode(ListNode head, ListNode node) {
        ListNode result = new ListNode(0);
        result.next = head;
        node.val = node.next.val;
        node.next = node.next.next;
        return result.next;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
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
        ListNode node = p;

        deleteNode(head, node);
        printList(head);
    }
}
