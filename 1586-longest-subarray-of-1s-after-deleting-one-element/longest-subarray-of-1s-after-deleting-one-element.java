class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0, r = 0, n = nums.length;
        int count0 = 0, ans=0;
        for(;r<n;r++)
        {
            if(nums[r] == 0) count0++;
            for(;count0>1;l++)
                if(nums[l] == 0) count0--;
            ans = Math.max(ans,r-l+1);
        }
        return ans-1;
    }
}