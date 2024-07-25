class Solution
{
     public Node reverseList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node ans = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return ans;
    }
    
    Node compute(Node head)
    {
        // your code here
        head = reverseList(head);
        Node newHead = head,tail = head;
        int max = head.data;
        while(head != null){
            Node next = head.next;
            if(head.data >= max){
                max = head.data;
                tail.next = head;
                tail = tail.next;
            }
            head = next;
        }
        tail.next = null;
        newHead = reverseList(newHead);
        return newHead;
    }
}
  
