/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if (head.next == null) return head;
        Node temp = head.next, pos = head;
        int prev = head.data;
        
        while (temp != null) {
            if (temp.data != prev){
                pos = pos.next;
                pos.data = temp.data;
                prev = temp.data;
            }
            temp = temp.next;
        }
        pos.next = null;
        return head;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/