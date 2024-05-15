package blind75;

import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class RemoveDuplicatesList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode sHead = new ListNode(), node = head;
        ListNode sTail = sHead;

        while(node!=null) {
            while(node.next!=null && node.next.val == node.val) {
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

    public static void main(String[] args) {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(1);
        ListNode m3 = new ListNode(3);

        m1.next = m2;
        m2.next = m3;

        ListNode k = deleteDuplicates(m1);
        printList(k);
    }

    public static void printList(ListNode head) {
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
