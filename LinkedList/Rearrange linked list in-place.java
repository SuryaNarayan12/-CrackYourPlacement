class Solution {//Position this line where user code will be pasted.
     public Node inPlace(Node root) {
        Node slow = root;
        Node fast = slow.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = root;
        Node head2 = slow.next;
        slow.next = null;

        Node prev = null;
        Node cur = head2;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head2 = prev;

        Node dummy = new Node(0);
        Node temp = dummy;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
            if (head2 != null) {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        return dummy.next;
    }
}
