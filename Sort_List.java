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
    public ListNode sortList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode mid = findMid(head);
            ListNode rightHead = mid.next;
            mid.next = null;
            ListNode left = sortList(head), right = sortList(rightHead);
            return merge(left,right);
        }

        return head;
    }

    ListNode findMid(ListNode head) {
        ListNode s = head, f = head.next;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    ListNode merge(ListNode l, ListNode r) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                curr.next = l;
                l = l.next;
            }else{
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        curr.next = (l != null) ? l : r;
        return dummy.next;
    }
}

/*
    Time Complexity : O(n log n)
    Space Complexity : O(1)
 */