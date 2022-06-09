package LinkedList;

public class LinkedListUtils {



    public static void addFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.next = null;
    }

}
