/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if ( head == null ) return head;
        Node temp = head, dummy = new Node(-1);
        Node res = dummy;

        while ( temp != null ) {
            Node cn = new Node(temp.val);
            cn.next = temp.next;
            temp.next = cn;
            temp = temp.next.next;
        }

        temp = head;

        while ( temp != null ) {
            Node cn = temp.next;
            if ( temp.random != null )
                cn.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head;

        while ( temp != null ) {
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}

/*
    Time complexity : O(n)
    Space Complexity : O(n)
 */