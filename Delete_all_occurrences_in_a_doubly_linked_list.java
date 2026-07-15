/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        while (head != null && head.data == x) {
            head = head.next;
            if(head != null)
                head.prev = null;
        }
        
        Node dummy = head;
        
        while (head != null) {
            if (head.data == x) {
                Node prev = head.prev, next = head.next;
                prev.next = next;
                if (next != null)
                    next.prev = prev;
            }
            head = head.next;
        }
        
        return dummy;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/