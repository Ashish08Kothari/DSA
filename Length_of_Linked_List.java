/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/