public class Question7_RotateLinkedList {

    static class ListNode {
        String val;
        ListNode next;

        ListNode(String val) {
            this.val = val;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        tail.next = head;

        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print("\"" + head.val + "\"->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode("ID_A01");
        head.next = new ListNode("ID_A02");
        head.next.next = new ListNode("ID_A03");
        head.next.next.next = new ListNode("ID_A04");
        head.next.next.next.next = new ListNode("ID_A05");
        head.next.next.next.next.next = new ListNode("ID_A06");

        int n = 2;
        System.out.println("Original list:");
        printList(head);

        ListNode rotated = rotateRight(head, n);
        System.out.println("Rotated list:");
        printList(rotated);
    }
}
