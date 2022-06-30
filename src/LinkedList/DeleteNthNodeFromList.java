package LinkedList;

public class DeleteNthNodeFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        if (size == n) {
            return head.next;
        }

        int index = size - n - 1;
        ListNode temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        return head;

    }

}
