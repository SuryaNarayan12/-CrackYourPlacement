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
    public void reorderList(ListNode head) {
        if(head.next == null){
            return;
        }
        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode rev = reverse(slow);
        merge(head,rev);
    }

    public void merge(ListNode head,ListNode rev){
        while(head != null){
            ListNode temp1 = head.next;
            ListNode temp2 = rev.next;
            head.next = rev;
            if(temp1 == null){
                break;
            }
            rev.next = temp1;
            head = temp1;
            rev = temp2;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head,ahead = null, prev = null;
        while(curr != null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
