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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dumm = new ListNode(0);
        ListNode current = dumm;
        while (list1 != null || list2 != null) {
            int a = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            int b = (list2 != null) ? list2.val : Integer.MAX_VALUE;
            if (a >= b) {
                current.next = new ListNode(b);
                current = current.next;
                list2 = list2.next;
            } else {
                current.next = new ListNode(a);
                current = current.next;
                list1 = list1.next;
            }
        }
        return dumm.next;
    }
}