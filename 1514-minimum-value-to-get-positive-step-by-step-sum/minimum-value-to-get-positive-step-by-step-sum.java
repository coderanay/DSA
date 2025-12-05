class Solution {
    public boolean min_step_value(int[] nums, int startVal)
    {
        int n = nums.length;
        int sum=startVal;
        for(int i=0;i<n;i++)
        {
            sum = sum + nums[i];
            if(sum < 1) return false;
        }
        return true;
    }
    public int minStartValue(int[] nums) {
        int n = nums.length;
        for(int i=0;i<10000;i++)
        {
            if(min_step_value(nums,i))
            {
                if(i != 0) return i;
            }
        }
        return -1;
    }
}