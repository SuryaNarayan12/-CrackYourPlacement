/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSorted(ListNode a,ListNode b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        ListNode result = null;
        if (a.val <= b.val) {
            result = a;
            result.next = mergeSorted(a.next, b);
        }
        else {
            result = b;
            result.next = mergeSorted(a, b.next);
        }
        return result;
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextOfMiddle);
        return mergeSorted(left,right);
    }

    public ListNode getMiddle(ListNode head)
    {
        if (head == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
