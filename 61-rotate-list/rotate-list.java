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

    public void rotate(int[] arr,int left,int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int cnt = 0;
        ListNode temp = head;        
        while(temp != null)
        {
            cnt++;
            temp = temp.next;
        }
        int[] arr = new int[cnt];
        temp = head;
        int idx = 0;
        while(temp != null)
        {
            arr[idx++] = temp.val;
            temp = temp.next; 
        }

        temp = head;
        k = k % cnt;
        int n = cnt;
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        idx = 0;
        while(temp != null)
        {
            temp.val = arr[idx++];
            temp = temp.next;
        }

        temp = head;

        return temp;
    }   
}