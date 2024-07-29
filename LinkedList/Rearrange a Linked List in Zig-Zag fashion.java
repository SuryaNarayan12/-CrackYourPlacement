class Solution {
    Node zigZag(Node head) {
        // add code here.
        boolean flag = true;
        Node current = head;
        while(current != null && current.next != null){
            if(flag){
                if(current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }else{
                if(current.data < current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            current = current.next;
            flag = !flag;
        }
        return head;
    }
}
