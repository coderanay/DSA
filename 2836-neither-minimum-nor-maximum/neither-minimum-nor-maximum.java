class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int max = nums[0];
        int count = -1;
        for(int num: nums)
        {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i] != min && nums[i] != max) 
            {
                count = nums[i];
                break;
            }
        }
        return count != -1 ? count : -1;
    }
}