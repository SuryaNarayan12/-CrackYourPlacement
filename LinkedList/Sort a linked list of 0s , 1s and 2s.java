class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        Node temp = head;
        while(head != null){
            if(head.data == 0){
                zeros++;
            }
            else if(head.data == 1){
                ones++;
            }
            else{
                twos++;
            }
            head = head.next;
        }
        Node newHead = temp;
        while(temp != null){
            if(zeros > 0){
                temp.data = 0;
                zeros--;
            }
            else if(ones>0){
                temp.data = 1;
                ones--;
            }
            else{
                temp.data = 2;
                twos--;
            }
            temp = temp.next;
        }
        return newHead;
    }
}
