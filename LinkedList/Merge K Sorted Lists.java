class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for(int i = 0;i<lists.length;i++){
            result = merge2Lists(result,lists[i]);
        }
        return result;
    }

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
}
