class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int startIndex = -1;
        int endIndex = -1;
        int outPlace = -1;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > maxK || nums[i] < minK) outPlace = i;
            if(nums[i] == minK) startIndex = i;
            if(nums[i] == maxK) endIndex = i;
            int diff = Math.max(0,Math.min(startIndex,endIndex)-outPlace);
            ans += diff;
        }
        return ans;
    }
}