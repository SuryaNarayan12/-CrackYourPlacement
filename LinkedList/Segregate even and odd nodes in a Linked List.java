class Solution {
    Node divide(Node head) {
        // code here
        Node even = getList(head,0);
        Node odd = getList(head,1);
        if(even == null) return odd;
        if(odd == null) return even;
        Node temp = even;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = odd;
        return even;
    }
    
    public Node getList(Node head,int target){
        Node newHead = null,tail = null;
        while(head != null){
            if(head.data%2 == target){
                if(newHead == null){
                    newHead = new Node(head.data);
                    tail = newHead;
                }else{
                    tail.next = new Node(head.data);
                    tail = tail.next;
                }
            }
            head = head.next;
        }
        return newHead;
    }
}
