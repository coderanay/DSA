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
        Stack<Integer> st=new Stack<>();
        ListNode temp = head;
        if (head == null || head.next == null) return true;
        if (head.next.next == null) return head.val == head.next.val;
        while(temp != null)
        {
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode t = head;
        while(t != null)
        {
            if(st.peek() == t.val) {
                st.pop();
            }
            t = t.next;
        }
        return st.isEmpty();
    }
}