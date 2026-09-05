class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxEle = Integer.MIN_VALUE , minEle = Integer.MAX_VALUE;
        int smallestEle = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++) 
            {
                maxEle = Math.max(maxEle,nums[j]);
            }
            for(int j=i;j<=n-1;j++)
            {
                minEle = Math.min(minEle,nums[j]);
            }
            if(maxEle - minEle <= k)
            {
                smallestEle = Math.min(smallestEle,i);
                maxEle = Integer.MIN_VALUE;
                minEle = Integer.MAX_VALUE;

            }
            maxEle = Integer.MIN_VALUE;
            minEle = Integer.MAX_VALUE;
        }

        return smallestEle == Integer.MAX_VALUE ? -1 : smallestEle;
    }
}