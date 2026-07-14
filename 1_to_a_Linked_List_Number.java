/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while (temp != null && carry != 0) {
            int num = temp.data + carry;
            temp.data = num % 10;
            carry = num / 10;

            if (temp.next == null && carry != 0) {
                temp.next = new Node(carry);
                carry = 0;
            }

            temp = temp.next;
        }
        head = reverse(head);
        return head;
    }
    
    Node reverse(Node head) {
        Node curr = head, prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/