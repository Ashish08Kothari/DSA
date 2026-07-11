/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node f = head, s = head;
        int cnt = 0;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                s = s.next;
                cnt++;
                while (f != s) {
                    s = s.next;
                    cnt++;
                }
                break;
            }
        }
        
        return cnt;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/