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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head,rev = null;
        while(temp != null){
            ListNode res = new ListNode(temp.val);
            res.next = rev;
            rev = res;
            temp = temp.next;
        }
        while(head != null && rev != null){
            if(head.val != rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;       
    }
}
