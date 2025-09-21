class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        long ans = Math.max(Math.abs(max-min),Math.abs(min-max));
        return ans*k;
    }
}