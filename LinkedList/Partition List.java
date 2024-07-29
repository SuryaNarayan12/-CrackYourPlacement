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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode allSmallHead =allSmall(head,x);
        ListNode allLargeHead = allLarge(head,x),temp = allSmallHead;
        if(allSmallHead == null){
            return allLargeHead;
        }
        if(allLargeHead == null){
            return allSmallHead;
        }
        while(temp.next != null){
            temp = temp.next;
        } 
        temp.next = allLargeHead;
        return allSmallHead;
    }
    public ListNode allSmall(ListNode head,int x){
        ListNode temp  = head;
        ListNode next = null;
        ListNode newHead  = null;
        while(temp != null){
            if(temp.val < x){
                if(newHead == null){
                    newHead = new ListNode(temp.val);
                    next = newHead;
                }else{
                    next.next = new ListNode(temp.val);
                    next = next.next;
                }
            }
            temp = temp.next;
        }
        return newHead;
    }

    public ListNode allLarge(ListNode head,int x){
        ListNode temp  = head;
        ListNode next = null;
        ListNode newHead  = null;
        while(temp != null){
            if(temp.val >= x){
                if(newHead == null){
                    newHead = new ListNode(temp.val);
                    next = newHead;
                }else{
                    next.next = new ListNode(temp.val);
                    next = next.next;
                }
            }
            temp = temp.next;
        }
        return newHead;
    }
}
