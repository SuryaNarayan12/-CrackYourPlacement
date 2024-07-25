public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode temp = head;
        ArrayList<ListNode> arr = new ArrayList<>();
        while(temp != null){
            if(arr.contains(temp)){
                return true;
            }
            arr.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
