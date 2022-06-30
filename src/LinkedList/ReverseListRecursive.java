package LinkedList;

public class ReverseListRecursive {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode nextHead = head.next;
        nextHead.next = head;
        head.next = null;
        return newHead;
    }
}
