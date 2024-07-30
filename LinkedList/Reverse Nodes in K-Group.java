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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)return head;
        int len = length(head);
        ListNode ahead = null, prev = null, curr = head;
        int count = 0;
        while( count < k && curr != null){
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
            count++;
        }        
        if(ahead != null && len-k >= k){
            head.next = reverseKGroup(ahead,k);
        }
        else{
            head.next = ahead;
        }
        return prev;
    }
    public int length(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
