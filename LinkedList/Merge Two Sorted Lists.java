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
     public ListNode merge2Lists(ListNode head1,ListNode head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        ListNode result;
        if(head1.val < head2.val){
            result = new ListNode(head1.val);
            head1 = head1.next;
        }
        else{
            result = new ListNode(head2.val); 
            head2 = head2.next;
        }
        ListNode ans = result;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                result.next = new ListNode(head1.val);
                result = result.next;
                head1 = head1.next;
            }else{
                result.next = new ListNode(head2.val);
                result = result.next;
                head2 = head2.next; 
            }
        }
        while(head1 != null){
            result.next = new ListNode(head1.val);
            result = result.next;
            head1 = head1.next;
        }
        while(head2 != null){
            result.next = new ListNode(head2.val);
            result = result.next;
            head2 = head2.next;
        }
        return ans;
    }
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        return merge2Lists(head1,head2);
    }
}
