class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) pq.add(num);
        int value = 0;
        while(k > 0)
        {
            value = pq.poll();
            k--;
        }
        return value;
    }
}