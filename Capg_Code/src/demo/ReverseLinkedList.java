package demo;

// Definition for singly-linked list node.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Printing original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Reversing the linked list
        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversedHead = rll.reverseLinkedList(head);

        // Printing reversed linked list
        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode cur = head, prev = null, temp;

        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    // Utility method to print the linked list
    private static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
}
