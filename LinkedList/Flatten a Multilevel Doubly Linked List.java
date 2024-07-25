/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null){
            Node next = temp.next;
            if(temp.child != null){
                temp.child.prev = temp;
                temp.next = flatten(temp.child);
                temp.child = null;
                while(temp.next != null){
                    temp = temp.next;
                }
                if(next != null) next.prev = temp;
                temp.next = next;
            }
            temp = next;
        }
        return head;
    }
}
