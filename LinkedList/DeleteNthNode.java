class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteNthNode {

    public static ListNode deleteSecondNode(ListNode head) {

        // if list has 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // delete 2nd node
        head.next = head.next.next;

        return head;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Linked List 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        // Linked List 2
        ListNode head2 = new ListNode(10);
        head2.next = new ListNode(20);
        head2.next.next = new ListNode(30);
        head2.next.next.next = new ListNode(40);

        // Linked List 3
        ListNode head3 = new ListNode(100);
        head3.next = new ListNode(200);

        // BEFORE deleting
        System.out.println("Before Deleting:");

        printList(head1);
        printList(head2);
        printList(head3);

        // delete 2nd node
        head1 = deleteSecondNode(head1);
        head2 = deleteSecondNode(head2);
        head3 = deleteSecondNode(head3);

        // AFTER deleting
        System.out.println("\nAfter Deleting:");

        printList(head1);
        printList(head2);
        printList(head3);
    }
}