class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int ans=0;
        int prev = nums[0];
        for(int i=1;i<n-1;i++)
        {
            if(nums[i] == nums[i+1]) continue;
            if(nums[i] > prev && nums[i] > nums[i+1]) ans++;
            if(nums[i] < prev && nums[i] < nums[i+1]) ans++;
            prev = nums[i];
        }
        return ans;
    }
}