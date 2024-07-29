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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l2.val == 0 || l1.val == 0){
            return (l2.val == 0) ? l1 : l2;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode temp1 = l1;
        ListNode prev = null;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1 != null && temp2 != null){
            prev = temp1;
            int sum = temp1.val + temp2.val + carry;
            carry = sum/10;
            temp1.val = sum%10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp2 != null){
            prev.next = temp2;
            temp1 = temp2;
        }
        while(temp1 != null){
            int sum = temp1.val + carry;
            carry = sum/10;
            temp1.val = sum%10;
            temp1 = temp1.next;
        }
        if(carry > 0){
            ListNode newHead = new ListNode(carry);
            newHead.next = reverse(l1);
            return newHead;
        }
        return reverse(l1);
    }

     public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ans = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return ans;
    }
}
