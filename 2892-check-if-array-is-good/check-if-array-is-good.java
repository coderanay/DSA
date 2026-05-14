class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        if(n == 1) return false;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] != i+1)
            {
                return false;
            }
        }

        return nums[n-1] == nums[n-2];
    }
}