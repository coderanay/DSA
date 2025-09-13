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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
        while(temp != null)
        {
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==1) ls.add(e.getKey());
        }
        int n=ls.size();
        Collections.sort(ls);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : ls) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}