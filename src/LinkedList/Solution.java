package LinkedList;

import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(); // minHeap

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for (ListNode head : lists) {
            while (head != null) {
                heap.add(head.val);
                head = head.next;
            }
        }

        while (!heap.isEmpty()) {
            temp.next = new ListNode(heap.remove());
            temp = temp.next;
        }

        return dummy.next;
    }
}