package blind75;

public class IsPalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode node = getUpperMidNode(head);
        ListNode reverse = reverse(node);

        while(head != null&& reverse != null) {
            if(head.val != reverse.val) return false;

            head = head.next;
            reverse = reverse.next;
        }

        return true;
    }

    private static ListNode reverse (ListNode head) {
        ListNode reverse= null;

        while(head != null) {
            ListNode next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }

        return reverse;
    }

    private static ListNode getUpperMidNode(ListNode head){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return fast != null ? slow.next: slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = new ListNode(2);
        ListNode q = new ListNode(2);
        ListNode r = new ListNode(1);

        head.next = p;
        p.next = q;
        q.next = r;

        System.out.println(isPalindrome(head));
    }
}
