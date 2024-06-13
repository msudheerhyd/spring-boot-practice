package blind75;

public class RemoveElementList {

    public static ListNode removeElement(ListNode head, int val) {

        ListNode sHead = new ListNode(0), sTail = sHead, node = head;

        while(node != null) {
            ListNode next = node.next;
            node.next = null;

            if(node.val != val) {
                sTail.next = node;
                sTail = node;
            }

            node = next;
        }
        return sHead.next;
    }

    public static void printList(ListNode node) {
        while(node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        ListNode q = new ListNode(3);
        ListNode r = new ListNode(4);
        ListNode s = new ListNode(5);

        head.next = p;
        p.next = q;
        q.next = r;
        r.next = s;

        int val = 3;

        ListNode k = removeElement(head, val);

        printList(k);
    }
}
