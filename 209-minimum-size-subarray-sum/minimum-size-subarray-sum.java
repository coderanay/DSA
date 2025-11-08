class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low=0;
        int maxLen=Integer.MAX_VALUE;
        int sum=0;
        for(int high=0;high<n;high++)
        {
            sum += nums[high];
            while(sum >= target)
            {
                maxLen = Math.min(maxLen,high-low+1);
                sum -= nums[low];
                low++;
            }
        }
        return maxLen == Integer.MAX_VALUE ? 0 : maxLen;
    }
}