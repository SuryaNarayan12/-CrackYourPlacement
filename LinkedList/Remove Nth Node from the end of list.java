class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = lengthOfList(head);
        ListNode ans = removeNthFromStart(head,length-n);
        return ans;
    }

    public int lengthOfList(ListNode head){
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public ListNode removeNthFromStart(ListNode head, int n){
        if(n == 0){
            return head.next;
        }
        ListNode prev = head , ans  = head;
        head = head.next;
        int pointer = 1;
        while(pointer < n){
            prev = head;
            head = head.next;
            pointer++;
        }
        prev.next = head.next;
        return ans;
    }
}
