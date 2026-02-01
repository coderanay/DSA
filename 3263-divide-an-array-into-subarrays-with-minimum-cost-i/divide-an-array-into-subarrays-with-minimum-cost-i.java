class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
         for(int i=1;i<n;i++)
        {
            if(nums[i] < min)
            {
                second_min = min;
                min = nums[i];
            } else if(nums[i] < second_min)
            {
                second_min = nums[i];
            }
        }
        return nums[0] + min + second_min;
    }
}