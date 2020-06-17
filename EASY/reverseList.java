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
    public ListNode reverseList(ListNode h) {
        ListNode p, c;
        p = null;
        c = h;
        while (h != null) {
            h = h.next;
            c.next = p;
            p = c;
            c = h;
        }
        return p;
    }
}
