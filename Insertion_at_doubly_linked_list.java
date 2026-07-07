/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node n = new Node(x), t = head;
        while(p!=0){
            t=t.next;
            p--;
        }
        n.next = t.next;
        n.prev = t;
        if(t.next!=null){
            t.next.prev = n;
        }
        t.next = n;
        
        return head;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/