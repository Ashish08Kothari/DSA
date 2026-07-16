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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        k = k % len;
        if (k == 0) return head;

        head = reverse(head, null);
        ListNode tail = head;
        for (int i = 0; i < k; i++) tail = tail.next;
        ListNode newHead = reverse(head, tail);
        head.next = reverse(tail, null);
        return newHead;
    }

    ListNode reverse(ListNode head, ListNode end) {
        ListNode prev = null, curr = head;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(1)
 */