class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(i != j && j != k) ans = Math.max(ans,nums[i] + nums[j] - nums[k]);
                }
            }
        }
        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}