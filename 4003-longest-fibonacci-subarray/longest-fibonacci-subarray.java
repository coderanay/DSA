class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cnt=0, max=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i] + nums[i+1] == nums[i+2])
            {
                cnt++;
                max = Math.max(max,cnt);
            }
            else 
            {
                cnt=0;
            }    
        }
        return max == Integer.MIN_VALUE ? 2 : max + 2;
    }
}