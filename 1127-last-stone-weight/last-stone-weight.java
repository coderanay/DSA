class Solution {
    public int lastStoneWeight(int[] nums) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        int n = nums.length;
        int count=0;
        int value=0;
        if(n < 2) return nums[n-1];
        for(int i=0;i<n;i++) pq.add(nums[i]);  
        while(pq.size()>1)
        {
            int y = pq.poll();
            int x = pq.poll();
            if(x != y)
            {
                pq.add(y-x);
            }
        }
        return pq.size() == 0 ? 0: pq.peek();
    }
}