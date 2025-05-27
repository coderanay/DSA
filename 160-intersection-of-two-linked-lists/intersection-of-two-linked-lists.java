public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode t1 = headA;
        ListNode t2 = headB;
        int size1 = 0, size2 = 0;
        while (t1 != null) {
            size1++;
            t1 = t1.next;
        }
        while (t2 != null) {
            size2++;
            t2 = t2.next;
        }
        t1 = headA;
        t2 = headB;
        if (size1 > size2) {
            int diff = size1 - size2;
            while (diff-- > 0) t1 = t1.next;
        } else {
            int diff = size2 - size1;
            while (diff-- > 0) t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1 == t2) return t1;
            t1 = t1.next;
            t2 = t2.next;
        }

        return null;
    }
}
