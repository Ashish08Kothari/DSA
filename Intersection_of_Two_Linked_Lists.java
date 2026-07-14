/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        if (a == b) return a;
        while (a != null && b != null) {
            a = a.next;
            b = b.next;

            if (a == null && b == null) return null;
            if (a == null) a = headB;
            if (b == null) b = headA;
            if (a == b) return a;
        }
        return null;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
 */