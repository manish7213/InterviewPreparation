package LinkedList;

public class NthNodeFromEnd {

    //    1 -> 6 -> 5 -> 8 -> 4 -> NULL, pos = 2, index 1 based positioning. here pos = 2 from left is 8

    private static ListNode nthNodeFromEnd(ListNode root, int pos) {
        ListNode cur = root;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        int index = size - pos; // 5 - 2 + 1
        ListNode temp = root;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        return temp;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return null;
        }
        int size = 0;
        ListNode cur = head;
        while(cur != null) {
            cur = cur.next;
            size++;
        }



        if(size == n) {
            return head.next;
        }

        int index = size - n - 1;
        ListNode temp = head;
        int i = 0;
        while(temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;


        return head;

    }


    private static void printLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val+" -> ");
            cur = cur.next;
        }
        System.out.println("NULL");
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        if (head == null) {
            return null;
        }

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        addFirst(6);
//        addFirst(5);
//        addFirst(8);
//        addFirst(4);

        LinkedListUtils.addLast(head,6);
        LinkedListUtils.addLast(head,5);
        LinkedListUtils.addLast(head,8);
        LinkedListUtils.addLast(head,4);
        printLinkedList(head);

        ListNode node = nthNodeFromEnd(head, 4);
        System.out.println(node.val);
        ListNode reverse = reverse(head);
        printLinkedList(reverse);

    }
}
