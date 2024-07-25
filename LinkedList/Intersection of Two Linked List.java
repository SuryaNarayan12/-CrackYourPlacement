public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA,tempB = headB;
        while(tempA != null){
            tempB = headB;
            while(tempB != null){
                if(tempA == tempB){
                    ListNode temp1 = tempA;
                    ListNode temp2 = tempB;
                    while(temp1 != null && temp2 != null){
                        if(temp1 != temp2){
                            break;
                        }
                        else{
                            temp1 = temp1.next;
                            temp2 = temp2.next;
                        }
                    }
                    if(temp1 == null && temp2 == null){
                        return tempB;
                    }
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }return null;
    }
    
}
