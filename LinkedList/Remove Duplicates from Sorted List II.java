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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        int[] hashtable = new int[201];
        ListNode temp = head;
        int smallest = 201;
        while(temp != null){
            hashtable[temp.val+100]++;
            if(smallest > temp.val) smallest = temp.val;
            temp = temp.next;
        }
        ListNode newHead = new ListNode(smallest);
        ListNode curr = null;
        for(int i = 0;i<201;i++){
            if(i == smallest){
                continue;
            }
            if(hashtable[i] == 1){
                if(curr == null){
                    curr = new ListNode(i-100);
                    newHead.next = curr;
                }else{
                    ListNode newN = new ListNode(i-100);
                    curr.next = newN;
                    curr = newN;
                }
            }
        }
        return newHead.next;
    }
}
