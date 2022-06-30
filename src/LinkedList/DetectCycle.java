package LinkedList;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }


    public ListNode findCycleStartPos(ListNode head) {
        ListNode meetingPoint = detectCycle(head);
        ListNode start = head;
        while (meetingPoint != start) {
            meetingPoint = meetingPoint.next;
            start = start;
        }
        return start;
    }

}