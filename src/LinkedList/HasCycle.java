package LinkedList;

public class HasCycle {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        return hasCycle;

    }


}
