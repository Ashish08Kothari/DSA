/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp = head;
        while (temp != null && temp.data != key) temp = temp.next;
        return temp != null;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/