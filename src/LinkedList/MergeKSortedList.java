package LinkedList;

import java.util.PriorityQueue;

/**
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * Example 2:
 * Input: lists = []
 * Output: []
 * Example 3:
 * Input: lists = [[]]
 * Output: []
 */

public class MergeKSortedList {

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
