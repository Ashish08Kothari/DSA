/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode f = head, s = head, prev = null, curr = null;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        curr = s;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        s = prev;
        f = head;
        
        while (s != null) {
            if (s.val != f.val) return false;
            s = s.next;
            f = f.next;
        }

        return true;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/