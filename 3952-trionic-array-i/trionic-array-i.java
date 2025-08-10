class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

       for(int p =1;p<n-2;p++)
       {
        for(int q=p+1;q<n-1;q++)
        {
            if(isIncreasing(nums,0,p) && isDecreasing(nums,p,q) && isIncreasing(nums,q,n-1)) 
                return true;
        }
       }
       return false;
    }

    public boolean isIncreasing(int[] nums, int start, int end)
    {
        for(int i=start;i<end;i++)
        {
            if(nums[i] >= nums[i+1]) return false;
        }
        return true;
    }
    public boolean isDecreasing(int[] nums, int start, int end)
    {
        for(int i=start;i<end;i++)
        {
            if(nums[i] <= nums[i+1]) return false;
        }
        return true;
    }
}
