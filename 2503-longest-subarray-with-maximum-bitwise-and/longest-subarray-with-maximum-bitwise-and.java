class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > max) max = nums[i];
        }
        int currLen = 0, maxLen = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == max)
            {
                currLen++;
                maxLen = Math.max(maxLen,currLen);
            } else 
            {
                currLen = 0;
            }
        }
        return maxLen;
    }
}