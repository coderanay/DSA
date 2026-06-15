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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode r = head, t = head, ct = null;
        while(r != null && r.next != null)
        {
            ct = t;
            t = t.next;
            r = r.next.next;
        }

        ct.next = t.next;
        return head;
    }
}