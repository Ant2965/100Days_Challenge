/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int p = 0;
        ListNode last = head;
        while (last != null) {
            p += 1;
            last = last.next;
        }

        if (p == 1) {
            return null;
        }
        p = p - n + 1;
        int h = 1;
        ListNode curr = head;
        ListNode pre = head;
        if (p == 1) {
            return curr.next;
        }
        while (h <= p) {
            if (h == p) {
                pre.next = curr.next;
            }
            pre = curr;
            curr = curr.next;
            h++;
        }
        return head;

    }
}