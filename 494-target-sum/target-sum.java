class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }

    public int helper(int[] nums,int target, int idx,int sum)
    {
        int n = nums.length;
        if(idx >= n) return sum == target ? 1 : 0;

        int subtract = helper(nums,target,idx+1,sum - nums[idx]);
        int addition = helper(nums,target,idx+1,sum + nums[idx]);
        

        return addition + subtract;
    }
}