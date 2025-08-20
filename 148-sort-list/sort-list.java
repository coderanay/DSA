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
        ListNode temp = head;
        List<Integer> al=new ArrayList<>();
        while(temp != null)
        {
            al.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(al);
         for(int i: al) System.out.println(i);
        temp = head;
        int p =0;
        while(temp != null)
        {
            temp.val = al.get(p++);
            temp = temp.next;
            // p++;
        }
        temp = head;
        return temp;
    }
}